package order.device;

public class Stereo {
    String name;
    public Stereo(String str)
    {
        name = str;
    }

    public void on()
    {
        System.out.println(name + "Stereo On");
    }

    public void off()
    {
        System.out.println(name + "Stereo Off");
    }

    public void setCD()
    {
        System.out.println(name + "Stereo setCD");
    }

    public void setVolume(int num)
    {
        System.out.println(name + "Stereo setVolume:" + num);
    }
}
