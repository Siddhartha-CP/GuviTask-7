package day9;

public class Ifelseifstatements {

	public static void main(String[] args) 
	{
		int age = 11;
		System.out.println("********Eligible to vote program*********");
		
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else if (age>12)
		{
		System.out.println("Not Eligible to vote1");
		}
		else if (age>=11)
		{
		System.out.println("Eligible to vote2");
		}
		else {
		System.out.println("Not Eligible to vote3");
		}
		System.out.println("Enf of program");

	}

}
