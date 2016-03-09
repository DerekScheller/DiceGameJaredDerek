import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {
	int boardWinLimit = 100;
	Dice diceRoll = new Dice();
	Scanner scanner = new Scanner(System.in);
	List<Player> listOfPlayers = new ArrayList<Player>();
	boolean answer;
	

	public GameBoard() {
	}

	public List<Player> GameSetUp() {
		System.out.println("How many people will be playing today?");
		int totalOfPlayers = scanner.nextInt();
		for (int i = 0; i < totalOfPlayers; i++) {
			System.out.println("What is this players name?");
			String inputName = scanner.next();
			System.out.println("Is this player human? 'Y' or 'N'");
			String inputPlayerType = scanner.next();
			if (inputPlayerType.equalsIgnoreCase("Y")) {
				inputPlayerType = "Human";
			} else
			{
				inputPlayerType = "AI";
			}
			Player player = new Player();
			player.setName(inputName);
			player.setType(inputPlayerType);
			listOfPlayers.add(player);
		}
		return listOfPlayers;
	}

	public void FullTurn(List<Player> listOfPlayers) {
		for (Player player : listOfPlayers) {
			System.out.println("It is " + player + "'s turn.");
			System.out.println("Your current  score is: " + player.playerTotalScore);
			DifficultySelection picked = new DifficultySelection();
			picked.PickYourDice();
			int diceSelector= picked.selecteddice;
			picked.difficultyselection();
			boolean answer = picked.answertrueorfalse;
			int playerDiceRoll = diceRoll.RollDice(diceSelector);
			System.out.println("You rolled a: " + playerDiceRoll);
			if (answer == true) 
			{
				player.playerTotalScore = player.playerTotalScore + playerDiceRoll;
				System.out.println("You answered correctly! Your new score is " + player.playerTotalScore + ".");
			}
			else
			{
				System.out.println("Your answer was incorrect! Your score will remain the same at " + player.playerTotalScore + ".");
			}
			if (player.playerTotalScore >= 100) 
			{
				System.out.println("You Win: " + player.name);
				break;
			}
		}
	}
}