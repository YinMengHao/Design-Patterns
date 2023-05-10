package 原型模式;

public class ConcretePrototype extends Prototype {

	private String atts;
	public ConcretePrototype(String atts) {
		// TODO Auto-generated constructor stub
		this.atts = atts;
	}
	public ConcretePrototype() {
		// TODO Auto-generated constructor stub
	}
	public String getAtts() {
		return atts;
	}
	public void setAtts(String atts) {
		this.atts = atts;
	}
	
	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAtts(this.atts);
		return prototype;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ConcretePrototype{" + "atts=" + atts + '\'' + "}" ;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof ConcretePrototype) {
			ConcretePrototype prototype = (ConcretePrototype) obj; 
			return atts.equals(prototype.getAtts());
		}
		return super.equals(obj);
	}
}
