package day13Exceptionhandling;

import java.util.Scanner;

public class MultipleCatchs {

		int a;
		int b;
		int c;
		int []arr=new int[5];
		String str= null;
		
		public void div() {
			
			try {
			c = a/b;
			arr[1 ]=c;
			
			System.out.println(str.length());
			
			} catch(ArithmeticException e) {
				
				c = a / 1;
				System.out.println("Please a value that is not 0");
				e.printStackTrace();
				
			}catch(ArrayIndexOutOfBoundsException e) {
				arr[1]=c;
				System.out.println(arr[1]);
				System.out.println("Index is beyond the limit so adding in first position");
				
			}catch(Exception e) {
				System.out.println("Exception occured, please check the code");
				e.printStackTrace();
			}

			System.out.println("The div value of a and b is : "+ c);
		}
		
		public static void main(String [] args) {
			MultipleCatchs obj= new MultipleCatchs();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for a:");
			obj.a=sc.nextInt();
			System.out.println("Enter the value for b:");
			obj.b=sc.nextInt();
			obj.div();
			sc.close();
			
		}
}
