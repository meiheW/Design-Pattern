package Others.builder;

public class ConcreteBuilder implements Builder {

	Computer computer = new Computer();
	
	@Override
	public void BuildCPU() {
		computer.add("组装CPU");
	}

	@Override
	public void BuildMainboard() {
		computer.add("组装主板");

	}

	@Override
	public void BuildHD() {
		computer.add("组装硬盘");

	}

	@Override
	public Computer GetComputer() {
		return computer;
	}

}
