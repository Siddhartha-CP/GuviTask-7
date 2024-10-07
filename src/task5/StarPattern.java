package task5;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (odd number):");
        int n = sc.nextInt();
        
        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print the stars depending on whether the row is odd or even
            if (i % 2 == 1) {
                // Print stars with a space between them for odd rows
                System.out.println("* *");
            } else {
                // Print stars next to each other for even rows
                System.out.println("**");
            }
        }

        sc.close();
    }
}
