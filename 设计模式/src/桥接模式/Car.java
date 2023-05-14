package 桥接模式;

public abstract class Car {
	protected Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public abstract void drive();
}
