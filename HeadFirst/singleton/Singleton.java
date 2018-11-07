package singleton;
	
	//******饿汉式******
	public class Singleton{
		private static Singleton uniqueSingleton = new Singleton();
		
		private Singleton(){};
		
		public static Singleton getInstance(){
			return uniqueSingleton;
		}
		
	} 
	
	//******懒汉式******
	//	public class Singleton {
	//		//静态变量记录唯一实例
	//		private volatile static Singleton uniqueSingleton;
	//		//构造器声明为私有
	//		private Singleton(){}
	//		//静态方法实例化对象，并返回实例
	//		public static  Singleton getInstance(){
	//			if(uniqueSingleton==null){
	//				synchronized(Singleton.class){
	//					if(uniqueSingleton==null){
	//						uniqueSingleton = new Singleton();
	//					}
	//				}
	//				
	//			}
	//			return uniqueSingleton;
	//		}
	//	}
	
	//	public class Singleton {
	//		//静态变量记录唯一实例
	//		private static Singleton uniqueSingleton;
	//		//构造器声明为私有
	//		private Singleton(){}
	//		//静态方法实例化对象，并返回实例
	//		public static synchronized Singleton getInstance(){
	//			if(uniqueSingleton==null){
	//				uniqueSingleton = new Singleton();
	//			}
	//			return uniqueSingleton;
	//		}
	//	}
	
	
	