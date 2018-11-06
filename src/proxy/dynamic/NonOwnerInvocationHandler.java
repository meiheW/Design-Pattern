package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException{

        try{
            if(method.getName().startsWith("get")){
                return method.invoke(person, args);
            }else if(method.getName().startsWith("setHotOrNotRating")){
                return method.invoke(person, args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
