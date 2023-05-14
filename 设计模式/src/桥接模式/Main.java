package 桥接模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefinedCar car = new BossCar(new HybridEngine());
		car.drive();
	}

}
