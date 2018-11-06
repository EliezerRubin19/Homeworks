
public class Passenger {
	
	//----------------Properties-------------------------
	private double ticketPrice;
	public int allowedSuitcaseWeight;
	private Suitcase swissSuitcase;
	private int priceOfOneKilogramOverweight;
	
	//----------------Setters and Getters-------------------------
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getAllowedSuitcaseWeight() {
		return allowedSuitcaseWeight;
	}
	public void setAllowedSuitcaseWeight(int allowedSuitcaseWeight) {
		this.allowedSuitcaseWeight = allowedSuitcaseWeight;
	}
	public Suitcase getSwissSuitcase() {
		return swissSuitcase;
	}
	public void setSwissSuitcase(Suitcase swissSuitcase) {
		this.swissSuitcase = swissSuitcase;
	}
	public int getPriceOfOneKilogramOverweight() {
		return priceOfOneKilogramOverweight;
	}
	public void setPriceOfOneKilogramOverweight(int priceOfOneKilogramOverweight) {
		this.priceOfOneKilogramOverweight = priceOfOneKilogramOverweight;
	}
	//----------------Constructors-------------------------
	public Passenger() {
		this.swissSuitcase=new Suitcase();
	}
	//----------------Methods-------------------------------

}