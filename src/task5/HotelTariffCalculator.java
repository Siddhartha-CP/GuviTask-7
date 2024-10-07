package task5;

import java.util.Scanner;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take inputs from the user
        Scanner sc = new Scanner(System.in);

        // Input: Month number (1-12)
        System.out.println("Enter the month number:");
        int month = sc.nextInt();

        // Input: Room rent per day
        System.out.println("Enter the room rent per day:");
        double roomRentPerDay = sc.nextDouble();

        // Input: Number of days stayed in the hotel
        System.out.println("Enter the number of days stayed in the hotel:");
        int daysStayed = sc.nextInt();

        // Variable to store the total tariff
        double totalTariff = 0;

        // Switch case to determine if it's peak season or not
        switch (month) {
            case 4:  // April
            case 5:  // May
            case 6:  // June
            case 11: // November
            case 12: // December
                // Peak season, apply 20% 
                totalTariff = roomRentPerDay * 1.2 * daysStayed;
                break;

            default:
                // Non-peak season, 
                totalTariff = roomRentPerDay * daysStayed;
                break;
        }

        // Output the total tariff formatted to 2 decimal places
        System.out.printf("Hotel Tariff: %.2f", totalTariff);

        // Close the Scanner
        sc.close();
    }
}
