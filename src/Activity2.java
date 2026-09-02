import java.util.Scanner;

public class Activity2 {

    Scanner sc = new Scanner(System.in);

    public void cinemaTicketing() {

        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int format = sc.nextInt();

        System.out.print("Enter Screening Hour (24-Hour Format, 0...24): ");
        int hour = sc.nextInt();

        int price = 0;
        String formatName = "";

        // FORMAT PRICE AND NAME
        if (format == 1) {
            price = 350;
            formatName = "REGULAR";
        }
        else if (format == 2) {
            price = 400;
            formatName = "3D";
        }
        else if (format == 3) {
            price = 450;
            formatName = "IMAX";
        }
        else {
            System.out.println("FORMAT NOT FOUND");
            return;
        }

        // PEAK HOUR FEE
        int peakHourFee = 0;

        if (hour >= 17 && hour <= 21) {
            peakHourFee = 50;
        }

        // TOTAL COST
        int totalCost = price + peakHourFee;

        // OUTPUT
        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + formatName);
        System.out.printf("Base Ticket Price: PHP %.2f%n", (double) price);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", (double) peakHourFee);
        System.out.println("------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", (double) totalCost);
        System.out.println("STATUS:            SEAT RESERVED");
    }

    public static void main(String[] args) {

        Activity2 ticket = new Activity2();

        ticket.cinemaTicketing();
    }
}