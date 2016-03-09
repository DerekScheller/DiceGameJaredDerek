import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {
	int boardWinLimit = 100;
	Dice diceRoll = new Dice();
	Scanner scanner = new Scanner(System.in);
	List<Player> players = new ArrayList<>();
	boolean answer;

	public GameBoard() {
	}

	public void GameSetUp(){
		System.out.println("How many people will be playing today?");
		int totalOfPlayers = scanner.nextInt();
		for(int i=0; i<totalOfPlayers; i++){
			System.out.println("What is this players name?");
			String inputName = scanner.next();
			System.out.println("Is this player human? 'Y' or 'N'");
			String inputPlayerType = scanner.next();
			if(inputPlayerType.contains("Y")){
				inputPlayerType = "Human";
			}else{
				inputPlayerType = "AI";
			}
			players.add(new Player(inputName, inputPlayerType));
		}
		public void FullTurn(List<Player> players){
				for(Player player : players){
				System.out.println("It is " + player + "'s turn.");
				System.out.println("Your current  score is: " + player.playerTotalScore);
				int diceSelector = 	20;
				int playerDiceRoll = diceRoll.RollDice(diceSelector);
				System.out.println("You rolled a: " + playerDiceRoll);
				if (answer == true){
					player.playerTotalScore = player.playerTotalScore + playerDiceRoll;
				}
				
				}
		}

	public void YouWin(List<Player> players) {
		for (Player player : players) {
			if (player.playerTotalScore >= 100) {
				System.out.println("You Win: " + player.name);
			}

		}
	}
}
