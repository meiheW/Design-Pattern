package proxy.dynamic;

import java.lang.reflect.Proxy;

public class MatchMakingTest {
    
    public static void main(String[] args){
        MatchMakingTest test = new MatchMakingTest();
        test.drive();
    }

    private void drive() {
        PersonBean joe = new PersonBeanImpl("Joe Javabean", "male", "Reading", 7);
        //PersonBean joe = new PersonBeanImpl();
        //ownerProxy
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy: "+ ownerProxy.getInterests());
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        //nonOwnerProxy
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling, Go");
        }catch (Exception ex) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }


    private PersonBean getOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
          person.getClass().getClassLoader(),
          person.getClass().getInterfaces(),
          new OwnerInvocationHandler(person)
        );
    }


}
