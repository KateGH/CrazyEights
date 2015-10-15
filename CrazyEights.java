import java.util.Scanner;

public class CrazyEights { // *1

	public boolean endGame = false;
	public int nrOfCardsInPlayingDeck;
	public Scanner keyboard = new Scanner(System.in);

	public Player currentPlayer;
	public Player p1;
	public Player p2;

	public static void main(String[] args) {
		new CrazyEights(); // create a new instance of *1, will call *1 constructor

		/* Why only create an object in the main method insted of writing all the code here?
			Answer: In this way you don't have to use static methods. Static methods do not allow you to create many instances, because you cannot use "this" inside of static methods.
		*/
	}

	public CrazyEights() { // constructor of *1

		System.out.print("Enter your name: ");

		this.p1 = new Player(keyboard.next(), 0);
		this.p2 = new Player("Computer", 0);

		while (!endGame) {
			// initGame();
			currentPlayer = p1;

			changeTurn();

			//en metod som skapar en ny deck

			CardsInPlayingDeck


			checkRestart();
		}
	}

	public ArrayList DeckofCards() {
		if (nrOfCardsInPlayingDeck == 0) {

		}
		return

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(11);
		numbers.add(3);
		return ;
		}
	}

	public void changeTurn() {
		if (currentPlayer == p1) {
			currentPlayer = p2;

		} else {
			currentPlayer = p1;
		}
	}

	public void checkRestart() {
		boolean  flag = false;

		do {
			String urge = "Do you want to restart? (y/n): ";
			System.out.println(urge);
			char userInput = keyboard.next().charAt(0);
			userInput = Character.toLowerCase(userInput);

			if (userInput == 'y') {
				System.out.println("New game!");
				flag = true;
				endGame = false;

			} else if (userInput == 'n') {
				System.out.println("Bye bye " + p1.name + "!");
				endGame = true;
				System.exit(0);

			} else {
				System.out.println("Invalid input!");
			}
		} while (!flag);
	}
}

