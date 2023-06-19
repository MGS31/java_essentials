package games;

import java.util.Scanner;

public class ChangeForDollar {
    // Ask the user to provide:
    // how many pennis, nickles, dimes and quarters.
    // program will count value of coins.
    // if the change is 1 Dollar they win.
    // if it's more than 1 Dollar tell them how much they went over.
    // if it's less than 1 dollar tell them how much they were under.

    public static void main(String[] args) {
        System.out.println("Welcome to the Change Game!");
        System.out.println("Please Enter enough change to make exactly $1.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies");
        int pennies = scanner.nextInt();
        System.out.println("Enter your number of nickles");
        int nickels = scanner.nextInt();
        System.out.println("Enter your number of dimes");
        int dimes = scanner.nextInt();
        System.out.println("Enter your number of quarters");
        int quarters = scanner.nextInt();

        scanner.close();

        int totalPennies = pennies;
        int totalNickels = nickels * 5;
        int totalDimes = dimes * 10;
        int totalQuarters = quarters * 25;

        double totalAmountInPennies = totalPennies + totalDimes + totalNickels + totalQuarters;
        double totalDollars = totalAmountInPennies / 100;
        if (totalDollars == 1) {
            System.out.println("Yay! That's Exactly $1.00! You Win!");
        } else if (totalDollars > 1) {
            double totalOverage = totalAmountInPennies - 100;
            System.out.println("Looks like you added to much! You're over by " + totalOverage + " cents");
        } else if (totalDollars < 1) {
            double totalUnder = 100 - totalAmountInPennies;
            System.out.println("Looks like you didn't add enough! You're under by " + totalUnder + " cents");
        } else {
            System.out.println("I think you forgot to add any money...");
        }
    }
}
