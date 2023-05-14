package 桥接模式;

public class BossCar extends RefinedCar {

	public BossCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Boss";
	}
}
