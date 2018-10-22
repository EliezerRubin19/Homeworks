
public class Airplane implements IFly {
	private String pilotName, airline, destination;
	boolean isLanded;
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isLanded() {
		return isLanded;
	}
	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}
	@Override
	public void fly(int velocity) {
		System.out.println("I fly "+velocity+" kph to "+destination);
		
	}
	@Override
	public boolean land() {
		if (isLanded) System.out.println("This flight landed");else System.out.println("Not arrived yet");
		return isLanded;
	}
	
	
	
	
}


