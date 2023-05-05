package 建造者模式;

public class MacComputerBuilder extends ComputerBuilder {
	
	private Computer computer;
	public MacComputerBuilder(String cpu, String ram) {
		computer = new Computer(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		// TODO Auto-generated method stub
		computer.setUsbCount(2);
	}

	@Override
	public void setKeyboard() {
		// TODO Auto-generated method stub
		computer.setKeyboard("苹果键盘");
	}

	@Override
	public void setDisplay() {
		// TODO Auto-generated method stub
		computer.setDisplay("苹果显示器");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
