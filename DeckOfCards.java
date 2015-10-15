import java.util.Random;
public class DeckOfCards {

	public static String[] suit = { "Hearts", "Diamonds", "Spades", "Clubs" };
	public static String[] value = { "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "J ", "Q ", "K ", "A " };
	public static String[] deck = new String[52];

	public DeckOfCards() {
		// Creating deckOfCards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = value[i % 13] + suit[i / 13];
			// print the unshuffled deck
			System.out.println(deck[i]);

		}

		// Shuffle the deck
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// shuffle the deck and print it
		for (String u : deck) {
			System.out.println(u);
		}
	}

}
