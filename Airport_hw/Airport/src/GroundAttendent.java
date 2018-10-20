
public class GroundAttendent extends Person{
	private int experience;
	private final String COUNTRY_OF_ORIGIN;
	private String department;
	
	public GroundAttendent(String firstyName, String familyName, int experience, String cOUNTRY_OF_ORIGIN,
			String department) {
		super(firstyName, familyName);
		this.experience = experience;
		COUNTRY_OF_ORIGIN = cOUNTRY_OF_ORIGIN;
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCOUNTRY_OF_ORIGIN() {
		return COUNTRY_OF_ORIGIN;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Years of experience:"+experience+"\nCountry of origin: "+COUNTRY_OF_ORIGIN+
				"\nDepartment: "+department);
	}
	
}
