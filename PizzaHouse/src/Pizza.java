
public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;
	protected static int count_toppings=0;	
	
	public Pizza(int diameter, int slices, int toppings) {
		this.diameter = Math.abs((diameter-10))%41+10;
		this.slices = Math.abs(slices-1)%8+1;
		this.toppings = Math.abs(toppings)%6;
		count_toppings+=this.toppings;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = Math.abs((diameter-10))%41+10;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = Math.abs(slices-1)%8+1;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = Math.abs(toppings)%6;
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
