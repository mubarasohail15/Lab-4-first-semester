import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        int books = input.nextInt();

        int points;

        // Decision structure for awarding points
        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else {
            points = 60;
        }

        System.out.println("You have earned " + points + " points this month.");

        input.close();
    }
}
