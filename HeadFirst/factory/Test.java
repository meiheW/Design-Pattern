package factory;

public class Test {
	
	public static void main(String[] args) {

		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
		
	}
	
}
