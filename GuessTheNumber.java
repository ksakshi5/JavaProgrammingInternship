import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!!!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations!!! You guessed the correct number.");
                    guessedCorrectly = true;
                    score += 1;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Attempt again.");
                } else {
                    System.out.println("Too high. Attempt again.");
                }

                attempts++;
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to take another chance? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
        }

        System.out.println("Doomed,Game Over. Your score is: " + score);
        scanner.close();
    }
}
