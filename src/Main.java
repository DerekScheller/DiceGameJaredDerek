
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String playagain;
		/*Dice Game Specs
		 Game must be more than just war with dice
		 Game must use OOP programming (classes and instantiation)
	 Game must use at least one of each dice (d4, d6, d8, d10, d12, d20)
		 Game must include options single player (against the AI)
		 Game must include multiplayer
		 Only class instantiation, variable declaration and assignment, and method calling is permitted in the main class/function
		You make the rules for your game, but it must be dice based and follow the above rules.*/
		//add loop for numbering player whos entering name next
		do{
		List<Player> playersadded = new ArrayList<Player>();
		GameBoard game = new GameBoard();
		game.GameSetUp();
		playersadded=game.players;
		game.FullTurn(playersadded);
		System.out.println("Do you want to play again?");
		playagain=scanner.next();
		}while(playagain.equalsIgnoreCase("yes"));
		System.out.println("Have a good day");
	}

}
