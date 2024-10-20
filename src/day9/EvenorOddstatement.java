package day9;

public class EvenorOddstatement {

	public static void main(String[] args) 
	{
		int num1=26;
		if(num1>0)
		{
			if(num1%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		else
		{
			System.out.println("Please enter a valid number");
		}

	}

}
