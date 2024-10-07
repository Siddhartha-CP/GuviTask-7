package day9;

public class Forloopstatement 
{
	public static void main(String[]args) 
	{
		//pattern problems
		/*
		for(int i = 1; i <= 10; i++)
			System.out.print(i + " ");
		*/
		
		/*
		 for(int i=10; i>=1; i--)
			System.out.print(i + " ");
			*/
		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(1+ " ");
			}
			System.out.println();
		}
		/*int num = 25;
		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=5;col++)
			{
				if(col == 5) {
					System.out.print(num);
				}else {
					System.out.print(num+ " ");
				}
				num--;
			}
			System.out.println();
		}*/
	}
}
