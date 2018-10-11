
public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;
	protected static int count_toppings=0;	
	
	public Pizza(int diameter, int slices, int toppings) {
		this.diameter = Math.abs((diameter-10))%41+10;
		this.slices = Math.abs(slices)%9;
		this.toppings = Math.abs(toppings)%6;
		count_toppings+=toppings;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}

	public boolean isBasicPizza() {
		return (toppings==0);
	}
	
	public void print() {
		System.out.println("Pizza's diameter: "+diameter+
				"   Number of slices: "+slices+
				"  Number of toppings: "+toppings);
	}
	
}
