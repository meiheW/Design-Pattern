package Others.interpreter;

/**
 * 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 *
 * Context 环境角色：存放方法中各个终结符所对应的具体值
 * Expression 抽象表达式：声明一个所有的具体表达式角色都需要实现的抽象接口
 * Variable、Constant 终结符表达式：实现了抽象表达式角色所要求的接口，主要是一个interpret()方法
 * And、Not、Or 非终结符表达式：一般是文法中的运算符或者其他关键字
 *
 * @author meihewang
 * @date 2018/11/12
 */
public class InterpreterTest {

    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x = " + x.interpret(ctx));
        System.out.println("y = " + y.interpret(ctx));
        System.out.println(exp.toString() + " = " + exp.interpret(ctx));
    }


}
