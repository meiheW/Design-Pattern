package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private float temperatures;
	private float humidity;
	private float pressure;
	
	private ArrayList observers;
	
	public WeatherData(){
		observers = new ArrayList();
	} 

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index>=0){
			observers.remove(index);
		}
	}

	public void notifyObserver() {
		for(int i=0; i<observers.size(); i++){
			System.out.println("notice observer "+i);
			Observer obs = (Observer) observers.get(i);
			obs.update(temperatures, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		System.out.println("change...");
		notifyObserver();
	}
	
	public void setMeasurements(float temperatures, float humidity, float pressure){
		this.temperatures = temperatures;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.println("set...");
		measurementsChanged();
		
	}
	
	
	

}
