package Others.builder;

public class ConcreteBuilder implements Builder {

	Computer computer = new Computer();
	
	@Override
	public void BuildCPU() {
		computer.add("��װCPU");
	}

	@Override
	public void BuildMainboard() {
		computer.add("��װ����");

	}

	@Override
	public void BuildHD() {
		computer.add("��װӲ��");

	}

	@Override
	public Computer GetComputer() {
		return computer;
	}

}
