import java.util.Scanner;
    
    public class hangman {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Display welcome message
            System.out.println("Welcome to Hangman!");
            System.out.println();
    
            // Prompt user to enter a word
            System.out.println("Please enter a word:");
            String word = scanner.nextLine();
    
            // Initialize game variables
            char[] letters = new char[word.length()];
            boolean gameOver = false;
            int incorrectGuesses = 0;
            String guess = "";
    
            // Generate a random letter for each position in the word
            for (int i = 0; i < letters.length; i++) {
                letters[i] = '_';
            }
    
            // Display the initial state of the game
            displayGameBoard(letters, word, incorrectGuesses);
    
            // Continue playing the game until the user wins or loses
            while (!gameOver) {
                System.out.println("Enter a letter: ");
                guess = scanner.nextLine();
    
                // Check if the user entered a valid guess
                if (guess.length() == 1) {
                    char letter = guess.charAt(0);
    
                    // Check if the letter is in the word
                    for (int i = 0; i < word.length(); i++) {
                        if (letter == word.charAt(i)) {
                            letters[i] = letter;
                        }
                    }
    
                    // Check if the user has won the game
                    if (isWordGuessed(letters)) {
                        gameOver = true;
                        System.out.println("You won!");
                    } else {
                        // Check if the user has lost the game
                        incorrectGuesses++;
                        displayGameBoard(letters, word, incorrectGuesses);
                        if (incorrectGuesses == 6) {
                            gameOver = true;
                            System.out.println("You lost.");
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please enter a single letter.");
                }
            }
    
            scanner.close();
        }
    
        // Check if the user has guessed all the letters in the word
        private static boolean isWordGuessed(char[] letters) {
            for (char letter : letters) {
                if (letter == '_') {
                    return false;
                }
            }
            return true;
        }
    
        // Display the game board
        private static void displayGameBoard(char[] letters, String word, int incorrectGuesses) {
            System.out.println("-------------");
            for (int i = 0; i < letters.length; i++) {
                System.out.print("| " + letters[i] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
    
            System.out.print("Incorrect Guesses: " + incorrectGuesses + "\n");
    
            System.out.print("Word: ");
            for (int i = 0; i < word.length(); i++) {
                if (letters[i]!= '_') {
                    System.out.print(letters[i] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
