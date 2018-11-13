package Others.mediator;

public abstract class Colleague {
    Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public  abstract void operation();
}
