import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class GameBoard{
	int boardWinLimit = 100;
	Dice diceRoll = new Dice();
	Scanner scanner = new Scanner(System.in);
	List<Player> players = new ArrayList<Player>();
	boolean answer;
	String inputName;
	String inputPlayerType;

	public GameBoard()
	{
	}

	public void GameSetUp() {
		System.out.println("How many people will be playing today?");
		int totalOfPlayers = scanner.nextInt();
		for (int i = 0; i < totalOfPlayers; i++) {
			System.out.println("What is this players name?");
			inputName = scanner.next();
			System.out.println("Is this player human? 'Y' or 'N'");
			inputPlayerType = scanner.next();
			if (inputPlayerType.equalsIgnoreCase("Y")) {
				inputPlayerType = "Human";
			} else
			{
				inputPlayerType = "AI";
			}
			players.add(new Player(inputName, inputPlayerType));
		}
			

	}

	public void FullTurn(List<Player> players) {
		int youwin = 0;
		while(youwin<=100)
		{
		for (Player player : players){
			DifficultySelection picked = new DifficultySelection();
			System.out.println("It is " + player.name + "'s turn.");
			System.out.println("Your current  score is: " + player.playerTotalScore);
			if(player.playerType=="AI")
			{
			picked.PickYourDiceAI();
			int diceSelector= picked.selecteddice;
			int answerAI = diceRoll.RollDice(2);
				if(answerAI==1)
				{
					answer=true;
				}
				else
				{
					answer=false;
				}
			int playerDiceRoll = diceRoll.RollDice(diceSelector);
			System.out.println("You rolled a: " + playerDiceRoll);
			if (answer == true) {
				player.playerTotalScore = player.playerTotalScore + playerDiceRoll;
				System.out.println("You answered correctly! Your new score is " + player.playerTotalScore + ".");
				youwin=player.playerTotalScore;
			}
			else
			{
				System.out.println("Your answer was incorrect! Your score will remain the same at " + player.playerTotalScore + ".");
				youwin=player.playerTotalScore;
			}
			}
			else
			{
			picked.PickYourDiceHuman();
			int diceSelector= picked.selecteddice;
			picked.difficultyselection();
			answer = picked.answertrueorfalse;
			int playerDiceRoll = diceRoll.RollDice(diceSelector);
			System.out.println("You rolled a: " + playerDiceRoll);
			if (answer == true) {
				player.playerTotalScore = player.playerTotalScore + playerDiceRoll;
				System.out.println("You answered correctly! Your new score is " + player.playerTotalScore + ".");
				youwin=player.playerTotalScore;
			}
			else
			{
				System.out.println("Your answer was incorrect! Your score will remain the same at " + player.playerTotalScore + ".");
				youwin=player.playerTotalScore;
			}
			}
			if (player.playerTotalScore >=100){
				System.out.println(player.name + " WINS!!");
			break; 
			}
		}
	}
}
}