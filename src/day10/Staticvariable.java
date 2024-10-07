package day10;

import java.util.Scanner;

public class Staticvariable {
	
	int num1;
	int num2;
	int result;
	
	static int num3;
	static int num4;
	static int value;
	
	public void add() {
		result= num1+num2;
		System.out.println("the addition value is :"+ result);
	}

	public int sub() {
		result= num1-num2;
		return result;
	}
	
	public static void mul() {
		value = num3*num4;
		System.out.println("the value of the mul is :" + value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvariable obj= new Staticvariable();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num1:");
		obj.num1=sc.nextInt();
		
		System.out.println("Enter the value of num2:");
		obj.num2=sc.nextInt();
		
		obj.add();
		int res= obj.sub();
		System.out.println("the sub value is :" + res);
		
		//to call static variable and method by using class name
		
		Staticvariable.num3= 40;
		Staticvariable.num4= 23;
		
		Staticvariable.mul();
		
		sc.close();
	}

}
