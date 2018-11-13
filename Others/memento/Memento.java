package Others.memento;

public class Memento {
    private int healthy;
    private int defence;
    private int attack;

    public Memento(Originator originator){
        setAttack(originator.getAttack());
        setDefence(originator.getDefence());
        setHealthy(originator.getHealthy());
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
