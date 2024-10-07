package day10;

import java.util.Scanner;

public class Newobjectcreation {
	
	int num1;
	int num2;
	int result;
	
	public void add() {
		result= num1+num2;
		System.out.println("the addition value is :"+ result);
	}

	public int sub() {
		result= num1-num2;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newobjectcreation obj= new Newobjectcreation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num1:");
		obj.num1=sc.nextInt();
		
		System.out.println("Enter the value of num2:v");
		obj.num2=sc.nextInt();
		
		obj.add();
		int res= obj.sub();
		System.out.println("the sub value is :" + res);
		
		sc.close();
	}

}
