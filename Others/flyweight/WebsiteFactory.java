package Others.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	private HashMap<String, ConcreteWebsite> flyweight = new HashMap<>();
	
	public Website GetWebsiteCategory(String name){
		if(!flyweight.containsKey(name)){
			flyweight.put(name, new ConcreteWebsite(name));
		}
		return flyweight.get(name);
	}
	
	public int GetWebsiteCount(){
		return flyweight.size();
	}
}
