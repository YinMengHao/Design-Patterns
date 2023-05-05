package 建造者模式;

public class LenovoComputerBuilder extends ComputerBuilder {
	
	private Computer computer;
	public LenovoComputerBuilder(String cpu, String ram) {
		computer = new Computer(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		// TODO Auto-generated method stub
		computer.setUsbCount(4);
	}

	@Override
	public void setKeyboard() {
		// TODO Auto-generated method stub
		computer.setKeyboard("联想键盘");
	}

	@Override
	public void setDisplay() {
		// TODO Auto-generated method stub
		computer.setKeyboard("联想显示器");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}
	
}
