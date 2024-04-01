import java.util.Random;
import java.util.Scanner;

public class randomNumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Welcome to the game \nI have selected a number between 1 and 100, can you guess the number?");

        boolean guessedRight = false;
        while (!guessedRight) {
            System.out.println("Input your number guess: ");
            int guess = scanner.nextInt();
            System.out.println("You have guesssed: "+guess);
            if (guess < randomNumber) {
                System.out.println("Your guess is too low! Guess something higher.");
                
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high! Guess something lower.");
            } else {
                System.out.println("You got it! You won the game!");
                guessedRight = true;
            }
        }
        
     }
}
