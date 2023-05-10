package 原型模式;

import java.util.Hashtable;

public enum PrototypeManager {
	instance;
	private Hashtable<String, Prototype> prototypeHashtable = new Hashtable<>();
	private PrototypeManager() {
        prototypeHashtable.put("CP", new ConcretePrototype("attrs"));
    }
    public void add(String key, Prototype prototype) {
        prototypeHashtable.put(key, prototype);
    }
    public Prototype get(String key) {
        return prototypeHashtable.get(key).clone();
    }
}
