import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coin values
        final double PENNY = 0.01;
        final double NICKEL = 0.05;
        final double DIME = 0.10;
        final double QUARTER = 0.25;

        // Get user input
        System.out.print("Enter the number of pennies: ");
        int pennies = input.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = input.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = input.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = input.nextInt();

        // Calculate total
        double total = (pennies * PENNY) + (nickels * NICKEL) + (dimes * DIME) + (quarters * QUARTER);

        // Compare to one dollar
        if (total == 1.00) {
            System.out.println("Congratulations! You made exactly one dollar!");
        } else if (total > 1.00) {
            System.out.println("Sorry, the amount entered is more than one dollar.");
        } else {
            System.out.println("Sorry, the amount entered is less than one dollar.");
        }

        input.close();
    }
}
