package oopsproblemsday12;

public class Dog {
	
	private String name;
	private String bread;
	
	public Dog(String name, String bread) {
		this.name = name;
		this.bread = bread;
		
	}
	
	public String getname() {
		return name;
		
	}
	
	public String getbread() {
		return bread;	
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setbread(String bread) {
		this.bread = bread;
	}
	
	public static void main(String [] args) {
		
		Dog obj = new Dog("BullDog", "Bull worrier");
		
		//print the intial values
		System.out.println("Name: "+obj.name);
		System.out.println("Bread: "+obj.bread);
		
		//update values
		obj.setname("Sissya");
		obj.setbread("Nayi");
		
		//print the modified value
		System.out.println("Modified values: ");
		System.out.println("Name: "+obj.name);
		System.out.println("Bread: "+obj.bread);
	}
}
