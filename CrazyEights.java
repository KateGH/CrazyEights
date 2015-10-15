import java.util.Scanner;

public class CrazyEights {

	public boolean endGame = false;
	public Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		new CrazyEights();
	}


	public CrazyEights() {		
		while (!endGame) {
			// initGame();
			checkRestart();
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
				System.out.println("Bye bye!");
				endGame = true;
				System.exit(0);

			} else {
				System.out.println("Invalid input!");
			}
		} while (!flag);
	}
}

