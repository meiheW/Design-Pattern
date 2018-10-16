package order.device;

public class Light {
    String name;
    public Light(String str)
    {
        name = str;
    }

    public void on()
    {
        System.out.println(name + "Light On");
    }

    public void off()
    {
        System.out.println(name + "Light Off");
    }
}
