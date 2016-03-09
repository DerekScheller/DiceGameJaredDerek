
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class DifficultySelection {
	
	boolean answercorrect = true;
	int selecteddice=0;
	Scanner scanner = new Scanner(System.in);
	Dice rndSelectAI = new Dice();
	String dicepickedbyplayer;
	boolean answertrueorfalse;
	public DifficultySelection()
	{
	}
	public int PickYourDiceAI()
	{
		int AIDiffSelection = rndSelectAI.RollDice(6);
		switch(AIDiffSelection){
		case 0:
		{
			selecteddice=4;
			return selecteddice;
		}
		case 1:
		{
			selecteddice=6;
			return selecteddice;
		}
		case 2:
		{
			selecteddice=8;
			return selecteddice;
		}
		case 3:
		{
			selecteddice=10;
			return selecteddice;
		}
		case 4:
		{
			selecteddice=12;
			return selecteddice;
		}
		default:
		{
			selecteddice=20;
			return selecteddice;
		}
		}
	}
	public int PickYourDiceHuman()
	{
		List<String> validplayerselection= Arrays.asList("4","6","8","10","12","20");
		System.out.println("Which difficulty dice would you like? (4,6,8,10,12,20) ");
		while(!validplayerselection.contains(dicepickedbyplayer))		
		{
			dicepickedbyplayer = scanner.next();
			dicepickedbyplayer = dicepickedbyplayer.toLowerCase();
		}
		switch(dicepickedbyplayer){
		case "4":
		{
			selecteddice=4;
			return selecteddice;
		}
		case "6":
		{
			selecteddice=6;
			return selecteddice;
		}
		case "8":
		{
			selecteddice=8;
			return selecteddice;
		}
		case "10":
		{
			selecteddice=10;
			return selecteddice;
		}
		case "12":
		{
			selecteddice=12;
			return selecteddice;
		}
		default:
		{
			selecteddice=20;
			return selecteddice;
		}
		}
	}
	
	public boolean difficultyselection() 
	{
		Questions questions = new Questions();
		answertrueorfalse=questions.QuestionSequence(selecteddice);
		return answertrueorfalse;

	}

}
