
public class SeatInCinema {

private int price;
private boolean occupied=false ;



public SeatInCinema(int price, boolean occupied) {
	super();
	this.price = (int)(Math.random()*20+70);
	this.occupied = occupied;
}

public  SeatInCinema(){
	this.setOccupied(false);
	this.setPrice((int)(Math.random()*20+70));
}

public boolean   isSeatOccupied(){
	return occupied;
}



public boolean isOccupied() {
	return occupied;
}



public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public void setOccupied(boolean occupied) {
	this.occupied = occupied;
}


}
