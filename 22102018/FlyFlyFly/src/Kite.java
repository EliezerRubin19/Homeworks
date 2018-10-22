
public class Kite implements IFly{
	private String color;
	private int price;
	private boolean isLanded;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price>0?price:10;
	}
	
	public boolean isLanded() {
		return isLanded;
	}
	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}
	@Override
	public void fly(int velocity) {
		System.out.println("I fly "+velocity+" kph to the sky");
		
	}
	@Override
	public boolean land() {
		if (isLanded) System.out.println("The kite landed on the ground");else System.out.println("The Kite is still in the sky");
		return isLanded;
	}
	
	

}
