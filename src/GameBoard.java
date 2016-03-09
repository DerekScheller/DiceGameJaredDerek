import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
	int boardWinLimit = 100;
	Dice diceRoll = new Dice();
	Scanner scanner = new Scanner(System.in);
	List<Player> players = new ArrayList<>();

	public GameBoard() {
	}

	public void GameSetUp(){
		System.out.println("How many people will be playing today?");
		int totalOfPlayers = scanner.nextInt();
		for(int i=0; i<totalOfPlayers; i++){
			System.out.println("What is this players name?");
			String inputName = scanner.next();
			System.out.println("Is this player human or AI?");
			String inputPlayerType = scanner.next();
			players.add(new Player(inputName, inputPlayerType);
		}
		public void FullTurn(List<Player> PlayerNames){
			PlayerNames.add(new Player("john"));
			Player.get.(NumOfPlayers)score = 0;
			Player.type = Userinput;
			PlayerNames.get(0).score = 7;
		}
			for(Player player : PlayerNames){
				System.out.println("It is " + player + "'s turn.");
				System.out.println("Your current  score is: " + player.playerTotalScore);
				int diceSelector = 	
				int playerDiceRoll = diceRoll.RollDice(DiceSelector);
				System.out.println("You rolled a: " + playerDiceRoll);
				PlayerTotalScore
				}
		}

	public void YouWin(List<String> PlayerNames, List<Integer> PlayerTotalScore) {
		for (int score : PlayerTotalScore) {
			if (score >= 100) {
				String PlayerName = PlayerNames.get();
				System.out.println("You Win: ", +PlayerName);
			}

		}
	}
}
