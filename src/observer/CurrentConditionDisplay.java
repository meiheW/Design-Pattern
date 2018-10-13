package observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperatures;
	private float humidity;
	private Subject weatherData; 
	
	CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("temperatures:" + temperatures+"..."+"humidity"+humidity);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperatures = temp;
		this.humidity = humidity;
		display();
	}

}
