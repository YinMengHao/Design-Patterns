package 原型模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAtts("test");

		ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
		ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
		System.out.println(clone1);
		System.out.println(clone2);

		System.out.println("clone1和clone2是否为同一个对象:" + (clone1 == clone2));
		System.out.println("clone1和clone2的属性值是否相同:" + clone1.equals(clone2));

		// 深克隆与浅克隆 --> 值类型 引用类型 --> 深克隆（序列化(Serialization)）
//		MonkeyKing monkeyKing = new MonkeyKing(120, 150, 18);
//		MonkeyKing copyMonkey = (MonkeyKing)monkeyKing.clone();
//		System.out.println("是同一个monkeyKing：" + (monkeyKing == copyMonkey));
//        System.out.println("是同一根棒子吗？ " + (monkeyKing.getGoldHoopStick() == copyMonkey.getGoldHoopStick()));

		MonkeyKing monkeyKing = new MonkeyKing(180, 75, 500);
		MonkeyKing copyMonkey = monkeyKing.deepClone();
		System.out.println("是同个猴子吗： " + (monkeyKing == copyMonkey));
		System.out.println("棒子是否相同： " + (monkeyKing.getGoldHoopStick() == copyMonkey.getGoldHoopStick()));
		
		
		Prototype p1 = PrototypeManager.instance.get("CP");
		Prototype p2 = PrototypeManager.instance.get("CP");
		System.out.println("两个对象是否为同一个对象： " + (p1 == p2));
        System.out.println("两个对象属性值是否相同： " + p1.equals(p2));
		
	}

}
