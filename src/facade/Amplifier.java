package facade;

public class Amplifier {
    DvdPlayer dvd;

    int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Amplifier setting DVD player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier setting volume to 5");
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
