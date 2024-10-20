package day13Exceptionhandling;

import java.util.Scanner;

public class Trycatchexceptionhandling {
	
	int a;
	int b;
	int c;
	
	public void div() {
		
		try {
		c = a/b;
		} catch(ArithmeticException e) {
			
			c = a / 1;
			System.out.println("Please a value that is not 0");
			
		}
		int d = a + b;
		System.out.println("The addition value of a and b is :"+ d);
		System.out.println("The div value of a and b is : "+ c);
	}
	
	public static void main(String [] args) {
		Trycatchexceptionhandling obj= new Trycatchexceptionhandling();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a:");
		obj.a=sc.nextInt();
		System.out.println("Enter the value for b:");
		obj.b=sc.nextInt();
		obj.div();
		sc.close();
		
	}
}
