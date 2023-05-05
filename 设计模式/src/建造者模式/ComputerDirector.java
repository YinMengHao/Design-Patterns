package 建造者模式;

public class ComputerDirector {
	public void makeComputer(ComputerBuilder builder) {
		builder.setUsbCount();
		builder.setKeyboard();
		builder.setDisplay();
	}
}
