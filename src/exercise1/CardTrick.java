package exercise1;
import java.util.Random;
import java.util.Scanner; 
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random rand = new Random();
            card.setValue(rand.nextInt(13)+ 1);
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = card;
//card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the card value (1-13)" );
    int guessValue;
    guessValue = scanner.nextInt();
    System.out.println("What is the card suit ");
    System.out.println("1. Hearts 2. Diamonds 3. Spades 4. Clubs");
    int guessSuit;
    guessSuit = scanner.nextInt()-1;
    
    boolean cardMatch = false;
    for (int i = 0; i < hand.length || cardMatch; i++){
        
        
        System.out.println("Checking Card " + i+1);
        if (hand[i].getSuit().equals(Card.SUITS[guessSuit]) && hand[i].getValue() == guessValue ){
         
            cardMatch = true;
            
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }
    if (cardMatch) {
        System.out.println("You have guessed correctly!");
    } else {
        System.out.println("You have guessed incorrectly!");
    }
    
    } 
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
