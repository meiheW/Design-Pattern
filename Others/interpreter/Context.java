package Others.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色：存放方法中各个终结符所对应的具体值
 *
 * @author meihewang
 * @date 2018/11/12
 */
public class Context {

    private Map<Variable,Boolean> map = new HashMap<>();

    public void assign(Variable var , boolean value){
        map.put(var, new Boolean(value));
    }

    public boolean lookup(Variable var) throws IllegalArgumentException{
        Boolean value = map.get(var);
        if(value == null){
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
