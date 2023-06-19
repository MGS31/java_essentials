package games;

import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {

        // travel the entire game board
        // game board is 20 spaces
        // max five die rolls

        Random random = new Random();

        int totalRolls = 0;
        int currentSpace = 0;
        int remaingSpaces = 20;
        // generate random number between 1 and 6 to represent die roll

        // tell the player which game space they are on.
        // also tell how man spaces are left to win.
        // repeat four times (five total rolls).
        System.out.println("You have rolled " + totalRolls + " times. " + "You are on space " + currentSpace
                + " and you have " + remaingSpaces + " to go.");

        for (int i = 0; i <= 5; i = i + 1) {
            if (totalRolls < 5 && remaingSpaces > 0) {
                int die = random.nextInt(6) + 1;
                int currentRoll = die;
                System.out.println("You have rolled a " + currentRoll);
                currentSpace = currentRoll + currentSpace;
                remaingSpaces = remaingSpaces - currentRoll;
                totalRolls = totalRolls + 1;
                System.out
                        .println(
                                "You are now on space " + currentSpace + " and you have " + remaingSpaces + " to go. "
                                        + "You have rolled " + totalRolls + " times");
                System.out.println();
            }
        }
        System.out.println("You finished on space " + currentSpace + " and you had " + remaingSpaces + " to go.");
    }
}
