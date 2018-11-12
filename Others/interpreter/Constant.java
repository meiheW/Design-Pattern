package Others.interpreter;

/**
 * 终结符表达式：实现了抽象表达式角色所要求的接口，主要是一个interpret()方法
 *
 * @author meihewang
 * @date 2018/11/12
 */
public class Constant extends Expression{

    private boolean value;

    public Constant(boolean value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj != null && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}
