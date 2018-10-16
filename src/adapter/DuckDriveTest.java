package adapter;

public class DuckDriveTest {
    
	public static void main(String[] args) {
        MallardDuck Duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter =  new TurkeyAdapter(turkey); // generate a turkey-like duck
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
	
}