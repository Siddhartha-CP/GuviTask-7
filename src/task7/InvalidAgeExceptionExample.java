package task7;

import java.util.Scanner;

public class InvalidAgeExceptionExample {

    // Custom exception class for handling invalid ages
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to validate age
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Error: Age must be at least 18.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        InvalidAgeExceptionExample example = new InvalidAgeExceptionExample();

        try {
            example.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        scanner.close();
    }
}
