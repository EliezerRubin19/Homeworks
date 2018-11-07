import java.util.ArrayList;

public class Suitcase {
	
	//----------------Properties-------------------------
	
	ArrayList<Item> itemsInSuitcase;
	private double totalWeight;
	
	//----------------Getters and Setters----------------
	public ArrayList<Item> getItemsInSuitcase() {
		return itemsInSuitcase;
	}
	public void setItemsInSuitcase(ArrayList<Item> itemsInSuitcase) {
		this.itemsInSuitcase = itemsInSuitcase;
	}
	public double getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}

		//----------------Constructors-----------------------

	public Suitcase() {
		itemsInSuitcase=new ArrayList<Item>();
	}
	//----------------Methods----------------------------
	
	
	public void addItem(Item item) {
	itemsInSuitcase.add(item);
	this.setTotalWeight(this.totalWeight+item.getWeight());
	}
	public void calcTotalWeight() {
		int total=0;
		for(Item i: itemsInSuitcase){
		total=total+=i.getWeight();
		}
		this.setTotalWeight(total);
		}
	
}
