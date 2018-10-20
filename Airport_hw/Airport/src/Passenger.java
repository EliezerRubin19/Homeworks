
public class Passenger extends Person{
	private int passportNumber;

	public Passenger(String firstyName, String familyName, int passportNumber) {
		super(firstyName, familyName);
		this.passportNumber = passportNumber;
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Passport number: "+passportNumber);
	}
	
}
