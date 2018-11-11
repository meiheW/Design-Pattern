package Others.flyweight;

public class FlyweightTest {

	public static void main(String[] args) {
		WebsiteFactory websiteFactory = new WebsiteFactory(); 
		
		
		Website fx = websiteFactory.GetWebsiteCategory("产品展示");
		fx.use();
		Website fy = websiteFactory.GetWebsiteCategory("产品展示");
		fy.use();
	 
		Website fz = websiteFactory.GetWebsiteCategory("产品展示");
		fz.use();
	 
		Website fl = websiteFactory.GetWebsiteCategory("博客");
		fl.use();
	 
		Website fm = websiteFactory.GetWebsiteCategory("博客");
		fm.use();
	 
		Website fn = websiteFactory.GetWebsiteCategory("博客");
		fn.use();
	 
		System.out.println("网站分类总数为：" + websiteFactory.GetWebsiteCount());
		
	}
}
