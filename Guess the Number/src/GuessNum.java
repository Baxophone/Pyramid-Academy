import java.util.Scanner;
import java.util.Random;

public class GuessNum {
    public static void main(String[] args) {
        GuessNum guessNum = new GuessNum();
        System.out.println("Hello! What is your name?");

        Scanner playerInput = new Scanner(System.in);
        String name = playerInput.nextLine();

        String playAgain = "";
        Scanner yesNo = new Scanner(System.in);

        do {
            guessNum.inputGuess(playerInput, name);
            System.out.println("Would you like to try again? Y/N");
            playAgain = yesNo.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }

    public void inputGuess(Scanner playerInput, String name) {
        System.out.println("Well " + name + " I am thinking of a number between 1 and 20. \nCan you guess what it is?");

        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        int guess = playerInput.nextInt();
        int guesses = 1;

        do {
            guesses++;
            if (guess < randomNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high! Try again.");
            }
            guess = playerInput.nextInt();
        } while (guess != randomNumber);

        System.out.println("Good job " + name + "! You guessed my number in " + guesses + "!");
    }
}


