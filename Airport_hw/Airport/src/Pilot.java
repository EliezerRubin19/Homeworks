
public class Pilot extends Person{
	private String flightLicenseNumber;
	private int yearsOfExperience;
	
	
	
	public Pilot(String firstyName, String familyName, String flightLicenseNumber, int yearsOfExperience) {
		super(firstyName, familyName);
		this.flightLicenseNumber = flightLicenseNumber;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getFlightLicenseNumber() {
		return flightLicenseNumber;
	}

	public void setFlightLicenseNumber(String flightLicenseNumber) {
		this.flightLicenseNumber = flightLicenseNumber;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Flying License number: "+flightLicenseNumber+
				"\nYears of experience: "+yearsOfExperience);
	}
	
	
}
