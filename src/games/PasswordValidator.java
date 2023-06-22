package games;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        printPasswordRules();

        Scanner scanner = new Scanner(System.in);

        boolean valid;

        do {
            System.out.println("Enter your new password: ");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while (!valid);
        System.out.println("The proposed password is valid");
        scanner.close();
    }

    public static void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements: ");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static boolean changePassword(String newPassword) {

        String userName = "johndoe";
        String password = "ABC_1234";
        boolean valid = true;
        String errorMessage = "";

        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += "\n Your Password must be over 8 Characters long.";
        }
        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errorMessage += "\n Your Password must contain an uppercase letter.";
        }
        if (newPassword.matches("[a-zA-Z0-9 ]*")) {
            valid = false;
            errorMessage += "\n Your Password must contain a special Character.";
        }
        if (newPassword.equals(password)) {
            valid = false;
            errorMessage += "\n Your Password cannot be the same as your previous Password.";

        }
        if (newPassword.toUpperCase().contains(userName.toUpperCase())) {
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }
        if (!valid) {
            System.out.println(errorMessage);
        }

        return valid;

    }
}
