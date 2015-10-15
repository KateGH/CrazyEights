import java.util.Scanner;

public class CrazyEights { // *1

	public boolean endGame = false;
	public Scanner keyboard = new Scanner(System.in);

	public Player currentPlayer;
	public Player p1;
	public Player p2;

	public static void main(String[] args) {
		new CrazyEights(); // create a new instance of *1, will call *1 constructor
	}

	public CrazyEights() { // constructor of *1

		System.out.print("Enter your name: ");

		this.p1 = new Player(keyboard.next(), 0);
		this.p2 = new Player("Computer", 0);

		while (!endGame) {
			// initGame();
			currentPlayer = p1;

			// game play
			changeTurn();
			checkRestart();
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

