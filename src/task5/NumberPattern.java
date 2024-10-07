package task5;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        
        // Variable to keep track of the current number to print
        int number = 1;
        
        // Outer loop for the number of rows
        for (int i = 1; i < rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(number + " ");  // Print the current number with a space
                number++;  // Increment the number for the next print
            }
            System.out.println();  // Move to the next line after each row
        }

        sc.close();
    }
}
