import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class blackJack {
    public static void main(String[] args) {
        
 
        //players
        ArrayList<String> players = new ArrayList<>();
        players.add("Jerome");
        players.add("John");
        players.add("Susie");
        players.add("Kody");
        players.add("Elliot");
        players.add("Jessica");

        Random randPlayer = new Random();
        int randomIndex = randPlayer.nextInt(players.size());

        System.out.println("Welcome to the Blackjack!");
        System.out.println("You will be playing against dealer " + players.get(randomIndex));

        System.out.println("Press enter to begin the game");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        //The cards
        ArrayList<String> deck = new ArrayList<>();
        String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String [] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(values[j] + " of " + suits[i]);
            }
        }

        int index1 = rand.nextInt(deck.size());
        int index2 = rand.nextInt(deck.size());
        while (index1 == index2) {
            index2 = rand.nextInt(deck.size());
        }

        //dealers cards

        int index3 = rand.nextInt(deck.size());
        int index4 = rand.nextInt(deck.size());
        while (index3 == index4 || index3 == index1 || index3 == index2) {
            index3 = rand.nextInt(deck.size());
        }
        while (index4 == index1 || index4 == index2 || index4 == index3) {
            index4 = rand.nextInt(deck.size());

        System.out.println(deck.get(index3) + deck.get(index4));
        System.out.println();
        
        
        
        System.out.println("Your cards: " + deck.get(index1) + " and " + deck.get(index2));
        System.out.println("Choose an option \n1. Stand \n2. Hit \n3. Double \n4. Split");
        Scanner choice = new Scanner(System.in);
        int option = choice.nextInt();

        if (option == 1) {
            if ()
        }
    }
}
