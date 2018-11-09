package Others.builder;

/**
 * ����Ʒ�������Ʒ�������̽��н������ʹ����ͬ�Ĵ����������õ���ͬ�Ĳ�Ʒ
 * ��ƷComputer����������Directer��Builder�ӿ�ʵ�ֽ���
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
