
public class Item {
	//----------------Properties-------------------------
	private double weight;
	private String name;
	
	//----------------Constructors-------------------------
	public Item(String name,double weight) {
		this.setName(name);
		this.setWeight(weight);
	}
	//----------------Getters and Setters-------------------------
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = (weight>0?weight:0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
