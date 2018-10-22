
public class Bird implements IFly{
    private String beerd,color;
    private int age;
    private boolean isLanded;
    
	public String getBeerd() {
		return beerd;
	}
	public void setBeerd(String beerd) {
		this.beerd = beerd;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age>0?age:1;
	}
	
	public boolean isLanded() {
		return isLanded;
	}
	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}
	@Override
	public void fly(int velocity) {
		System.out.println("I fly "+velocity+" kph to the trees");
	}
	@Override
	public boolean land(){
		if (isLanded) System.out.println("This bird has landed on the tree");else System.out.println("The Bird is still flying");
		return isLanded;
	}
    

  
	}
 