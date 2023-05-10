package 原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//public class GoldHoopStick {
public class GoldHoopStick implements Serializable {
	private float height = 100.f;
	private float weight = 50.f;
	
	public void grow() {
		height = height * 2;
		weight = weight * 2;
	}
	
	public void shrink() {
		height = height / 2;
		weight = weight / 2;
	}
	
	public GoldHoopStick deepClone() {
		Object object = null;
		try {
			//将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            object = ois.readObject();
            return (GoldHoopStick) object;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
