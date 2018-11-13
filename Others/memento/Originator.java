package Others.memento;

public class Originator implements Cloneable{

    private int healthy;
    private int defence;
    private int attack;

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

    public void birth(){
        this.setAttack(100);
        this.setDefence(100);
        this.setHealthy(100);
    }

    public void fight(){
        this.setAttack(20);
        this.setDefence(20);
        this.setHealthy(20);
    }

    public Memento saveStates(){
        try{
            Originator record = (Originator)this.clone();
            return new Memento(record);
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return null;
    }

    public void setMemento(Memento memento){
        this.setAttack(memento.getAttack());
        this.setDefence(memento.getAttack());
        this.setHealthy(memento.getHealthy());
    }

    public void showState(){
        System.out.println(this.toString()+"\n");
    }

    @Override
    public String toString() {
        return "Originator{" +
                "healthy=" + healthy +
                ", defence=" + defence +
                ", attack=" + attack +
                '}';
    }
}
