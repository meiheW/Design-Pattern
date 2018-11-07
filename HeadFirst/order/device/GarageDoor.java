package order.device;

public class GarageDoor {
    String name;
    public GarageDoor(String str)
    {
        name = str;
    }

    public void up()
    {
        System.out.println(name + "GarageDoor On");
    }

    public void down()
    {
        System.out.println(name + "GarageDoor Off");
    }
}
