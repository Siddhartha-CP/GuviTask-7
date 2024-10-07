package task5;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string to reverse:");
        String originalString = sc.nextLine();
        
        // Initialize an empty string to hold the reversed version
        String reversedString = "";
        
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        sc.close();
    }
}
