package observer;

public class Test {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(30, 65, 20.0f);
		weatherData.setMeasurements(31, 60, 30.0f);
	}
}
