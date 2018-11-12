package Others.chainofresponsibility;

public class Trouble {
    int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
