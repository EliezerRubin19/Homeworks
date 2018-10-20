
public abstract class Person {

	private  String firstyName;
	private  String familyName;
	
	//--------Ctor----------------------------------
	
	public Person(String firstyName, String familyName) {

		this.firstyName = firstyName;
		this.familyName = familyName;
	}
	
	//-----getters & setters-------------------------
	public String getFirstyName() {
		return firstyName;
	}
	public void setFirstyName(String firstyName) {
		this.firstyName = firstyName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	//----------------------Methods------------------------
	public void print() {
		System.out.println("First name: "+firstyName+
				"\nFamily name: "+familyName);
	}
}
