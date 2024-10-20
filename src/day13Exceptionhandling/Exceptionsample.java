package day13Exceptionhandling;

import java.util.Scanner;

public class Exceptionsample {
	int a;
	int b;
	
	public void div() {
		int c = a/b;    
		System.out.println(c);
	}
	
	public static void main(String [] args) {
		Exceptionsample obj = new Exceptionsample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a:");
		obj.a=sc.nextInt();
		System.out.println("Enter the value for b:");
		obj.b=sc.nextInt();
		obj.div();
		sc.close();
	}
}
