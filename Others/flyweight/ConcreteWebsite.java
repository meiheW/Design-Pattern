package Others.flyweight;

public class ConcreteWebsite implements Website {
	
	private String name = "";
	
	public ConcreteWebsite(String name){
		this.name = name;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("网站分类："+name);
	}

}
