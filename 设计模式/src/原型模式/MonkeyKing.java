package 原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//public class MonkeyKing implements Cloneable {
//@SuppressWarnings("serial")
public class MonkeyKing implements Serializable {
	private int height;
	private int weight;
	private int age;
	private GoldHoopStick goldHoopStick;
	public GoldHoopStick getGoldHoopStick() {
		return goldHoopStick;
	}
	public void setGoldHoopStick(GoldHoopStick goldHoopStick) {
		this.goldHoopStick = goldHoopStick;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public MonkeyKing(int height, int weight, int age) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		goldHoopStick = new GoldHoopStick();
	}
	
	public MonkeyKing deepClone() {
		Object object = null;
		try {
			// 将对象写入流中 
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(this);
			// 将对象从流中取出
			ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			object = objectInputStream.readObject();
			return (MonkeyKing)object;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
//	@Override
//	protected Object clone() {
//		// TODO Auto-generated method stub
//		MonkeyKing monkeyKing = null;
//		try {
//			monkeyKing = (MonkeyKing) super.clone();
//			return monkeyKing;
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return monkeyKing;
//		}
//	}
	
}
