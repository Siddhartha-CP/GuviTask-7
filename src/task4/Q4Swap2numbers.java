package task4;

public class Q4Swap2numbers {

	public static void main(String[] args) 
	{
		int num1 = 5;
        int num2 = 10;

        // Print original values
        System.out.println("Before swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        num1 = num1 + num2; // num1 becomes 15 (5 + 10)
        num2 = num1 - num2; // num2 becomes 5 (15 - 10)
        num1 = num1 - num2; // num1 becomes 10 (15 - 5)

        System.out.println("After swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
	}

}
