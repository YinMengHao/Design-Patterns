package 桥接模式;

public abstract class RefinedCar extends Car {

	public RefinedCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	public void drive() {
		this.engine.start();
		System.out.println("Drive" + getBrand());
	}
	
	public abstract String getBrand();
}
