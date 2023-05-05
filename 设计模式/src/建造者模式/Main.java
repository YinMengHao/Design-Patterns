package 建造者模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("建造者模式");
		
		ComputerDirector dirctor = new ComputerDirector();
		ComputerBuilder builder = new MacComputerBuilder("Inter处理器", "Dynamic Ram");
		dirctor.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println("mac computer:" + macComputer.toString());
        
        ComputerDirector dirctor1 = new ComputerDirector();
        ComputerBuilder builder1 = new LenovoComputerBuilder("I7处理器", "动态硬盘");
        dirctor1.makeComputer(builder1);
        Computer lenovoComputer = builder1.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());
	}

}
