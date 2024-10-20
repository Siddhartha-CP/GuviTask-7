package day9;

public class Ifelsenestedstatement {

	public static void main(String[] args) 
	{
		int num1=1;
		int num2=2;
		
		if(num1==1)
		{
			if(num2==2)
			{
				System.out.println("number is valid");
			}
			else
			{
				System.out.println("invalid number");
			}
		}
			else 
			{
				System.out.println("condition failed");
			}
		}

	}

