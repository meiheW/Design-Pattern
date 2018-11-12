package Others.interpreter;


/**
 * 抽象表达式：声明一个所有的具体表达式角色都需要实现的抽象接口
 *
 * @author meihewang
 * @date 2018/11/12
 */
public abstract class Expression {

    public abstract boolean interpret(Context ctx);
    public abstract boolean equals(Object obj);
    public abstract int hashCode();
    public abstract String toString();

}
