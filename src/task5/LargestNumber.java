package task5;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: Three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        // Determine the largest number using if-else statements
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
