package Others.mediator;

public class ConcreteColleagueB extends Colleague {

    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }

    @Override
    public void operation() {
        System.out.println("B operating.");
    }

}
