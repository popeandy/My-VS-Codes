
import java.util.*;

class Card {
    
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    int getBJValue() {
        if (value.equals("Ace")) {
            if (firstTotalPlayerValue > 10 || (firstTotalPlayerValue + decl.get(index5).getBJValue()) > 10) {
                return 1;
            } else {
                return 11;
            }
        } else if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }
}
