package sorting;

public class Student {
	//-----------------------properties---------------------
	private String name;
	private int age;
	private int grade;
	
	//---------------Constructors----------------------------
	public Student(String name,int age,int grade) {
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	//-------------------- Setters and Getters----------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = ((age>=18 && age<=120)?age:0);
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = ((grade>=0 && grade<=100)?grade:0);
	}
	
	
	//-----Methods---------------------------------
	
	@Override
	public String toString() {
		
		return "Name: "+name+" Age: "+age+" grade: "+grade;
	}
}
