package Others.mediator;

public class ConcreteColleagueA extends Colleague {

    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }

    @Override
    public void operation() {
        System.out.println("A operating.");
    }
}
