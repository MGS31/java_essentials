package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // 1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        // Scanner function imported from java utils allows the console
        // to request information
        // and the System.in records the response from the user.
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        // 2. Get the hourly pay rate.
        double payRate = 0;

        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        // 3. Multiply hours pay rate.
        double grossPay = hours * payRate;

        // 4. Dispaly result
        System.out.println("Gross pay: " + grossPay);
    }
}