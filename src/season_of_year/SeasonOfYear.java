package season_of_year;

import java.util.Scanner;

public class SeasonOfYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seasonOfYear = "";
        System.out.println("what is your favourite season of the year?");
        seasonOfYear = scanner.next();

        int wholeNumber = 0;
        System.out.println("Enter a whole number");
        wholeNumber = scanner.nextInt();

        String adjective = "";
        System.out.println("Provide an adjective");
        adjective = scanner.next();

        scanner.close();

        System.out.println(
                "on a " + adjective + " " + seasonOfYear + " day, I drink a minimum of " + wholeNumber
                        + " cups of coffee");
    }
}
