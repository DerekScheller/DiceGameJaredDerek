import java.util.Scanner;
public class Player{
	Scanner scanner = new Scanner(System.in);
	int playerTotalScore;
	String name;
	String playerType;
public Player(String Name, String PlayerType){
	name = Name;
	playerType = PlayerType;
	playerTotalScore = 0;
}
}