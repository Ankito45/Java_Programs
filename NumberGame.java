import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number Game!");

        while (true) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = new Random().nextInt(100) + 1;

            // Additional details
            int attempts = 0;
            int maxAttempts = 10;
            int roundsWon = 0;

            Scanner sc = new Scanner(System.in);

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("\nGuess the number (between 1 and 100): ");
                int userGuess = sc.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in "
                            + (attempts + 1) + " attempts.");
                    roundsWon++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            }

            // Check if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("\nGame Over! You won " + roundsWon + " round(s).");
                break;
            }
        }
    }
}
