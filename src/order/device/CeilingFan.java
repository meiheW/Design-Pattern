package order.device;

public class CeilingFan {
    String name;
    public CeilingFan(String str){
        name = str;
    }

    public void on(){
        System.out.println(name+"CeilingFan On");
    }

    public void off(){
        System.out.println(name+"CeilingFan Off");
    }
}
