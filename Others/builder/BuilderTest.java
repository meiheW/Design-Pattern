package Others.builder;

/**
 * 将产品本身与产品创建过程进行解耦，可以使用相同的创建过程来得到不同的产品
 * 产品Computer、创建过程Directer、Builder接口实现解耦
 * @author meihe wang
 * @date 2018/11/9
 *
 */
public class BuilderTest {
	public static void main(String[] args){

		Director director = new Director();
		Builder builder = new ConcreteBuilder();
		
		director.Construct(builder);
		
		Computer computer = builder.GetComputer();
		computer.show();
		
		
	}
}
