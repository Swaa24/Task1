import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;
        int round = 1;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Round " + round);
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Guess the number!");

            int attempts = 0;
            boolean guessed = false;

            while (!guessed && attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    guessed = true;
                    score += maxAttempts - attempts + 1;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (userGuess < targetNumber) {
                    System.out.println("The number is higher. Try again.");
                } else {
                    System.out.println("The number is lower. Try again.");
                }
            }

            if (!guessed) {
                System.out.println("You ran out of attempts. The number was " + targetNumber + ".");
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
            round++;
        }

        System.out.println("Thank you for playing! Final score: " + score);
        scanner.close();
    }
}
