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

        //The cards
        ArrayList<Card> deck = new ArrayList<>();
        String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String [] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
        }

        Random rand = new Random();

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 13; j++) {
        //         deck.add(values[j] + " of " + suits[i]);
        //     }
        // }

        int index1 = rand.nextInt(deck.size());
        int index2 = rand.nextInt(deck.size());
        while (index1 == index2) {
            index2 = rand.nextInt(deck.size());
        }

        System.out.println("Press enter to begin the game");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        //dealers cards

        int index3 = rand.nextInt(deck.size());
        int index4 = rand.nextInt(deck.size());
        while (index3 == index4 || index3 == index1 || index3 == index2) {
            index3 = rand.nextInt(deck.size());
        }
        while (index4 == index1 || index4 == index2 || index4 == index3) {
            index4 = rand.nextInt(deck.size());
        }

        //Hit Cards
        int index5 = rand.nextInt(deck.size());
        int index6 = rand.nextInt(deck.size());
        while (index5 == index6 || index5 == index1 || index5 == index2 || index5 == index3 || index5 == index4) {
            index5 = rand.nextInt(deck.size());
        }
        while (index6 == index1 || index6 == index2 || index6 == index3 || index6 == index4 || index6 == index5) {
            index6 = rand.nextInt(deck.size());
    
        }

        System.out.println();

        //Calculate total player card value
        int firstTotalPlayerValue = deck.get(index1).getBJValue() + deck.get(index2).getBJValue();

        //Calculate total dealer card value
        int firstTotalDealerValue = deck.get(index3).getBJValue() + deck.get(index4).getBJValue();

        //Printing cards
        System.out.println("Your cards: " + deck.get(index1).getValue() + " of " + deck.get(index1).getSuit() + " and " + deck.get(index2).getValue() + " of " + deck.get(index2).getSuit());
        System.out.println("Your card value is: " + firstTotalPlayerValue);
        System.out.println("Choose an option \n1. Stand \n2. Hit \n3. Double \n4. Split");
        Scanner choice = new Scanner(System.in);
        int option = choice.nextInt();

        if (option == 1) {
            System.out.println("You stand, your card value stays the same.");
        } else if (option == 2) {
            System.out.println("You hit. You get a " + deck.get(index5).getValue() + " of " + deck.get(index5).getSuit());
            System.out.println("Your new card value is: " + (firstTotalPlayerValue + deck.get(index5).getBJValue()));
            if(firstTotalPlayerValue + deck.get(index5).getBJValue() > 21) {
                System.out.println("You busted! You Lose!");
                // scanner.close();
            }
            System.out.println("Choose an option \n1. Stand \n2. Hit \n3. Double \n");
            Scanner choice2 = new Scanner(System.in);
            int option2 = choice2.nextInt();
            if (option2 == 1) {
                System.out.println("You Stand");
                System.out.println("The dealer displays their cards: " + deck.get(index3).getValue() + " of " + deck.get(index3).getSuit() + " and " + deck.get(index4).getValue() + " of " + deck.get(index4).getSuit());
                System.out.println("Their total value is: " + firstTotalDealerValue);
                if (firstTotalDealerValue > firstTotalPlayerValue + deck.get(index5).getBJValue()) {
                    System.out.println("You Lose!");
                } else if (firstTotalDealerValue == firstTotalPlayerValue + deck.get(index5).getBJValue()) {
                    System.out.println("You Tied. Womp womp.");
                } else {
                    System.out.println("You Win!");
                }
        }
        }
} 
}
}
