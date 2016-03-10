import java.util.Scanner;
public class Questions {
Dice rndQuestion = new Dice();
boolean questionAnswer;
boolean answerReal;
	public Questions(){}
	
	public boolean QuestionSequence(int DiceSelection){
	Scanner scanner = new Scanner(System.in);
	boolean AnswerReal = QuestionSelection(DiceSelection);
	System.out.println("Is this question True or False?");
	boolean UserAnswer = scanner.nextBoolean();
	return (AnswerReal == UserAnswer);	
	}
	public boolean QuestionSelection(int SelectCategory){
		switch (SelectCategory){
		case 4 :
			answerReal = VeryEasy();
			return answerReal;
		case 6 :
			answerReal = Easy();
			return answerReal;
		case 8 :
			answerReal = Medium();
			return answerReal;
		case 10 :
			answerReal = Tough();
			return answerReal;
		case 12 :
			answerReal = Hard();
			return answerReal;
		default :
			answerReal = Obscene();
			return answerReal;
		
		}
	}
	public boolean Obscene(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("The popular image of Santa Claus – chubby, bearded, in red and white clothes – was invented by Coca-Cola for an ad campaign?");
			return false;
		case 1 :
			System.out.println("The top of the Eiffel Tower leans away from the sun?");
			return true;
		case 2 :
			System.out.println("Drinking alcohol kills brain cells?");
			return false;
		default:
			System.out.println("The owner of the company that makes Segways died after accidentally driving his Segway off a cliff?");
			return true;
		}}
	public boolean Hard(){
		int selectQuestion = rndQuestion.RollDice(4);
		boolean answer;
		switch (selectQuestion){
		case 0 :
			System.out.println("Buzz Aldrin was the first man to urinate on the moon?");
			return true;
		case 1 :
			System.out.println("Donald Trump has filed for personal bankruptcy?");
			return false;
		case 2 :
			System.out.println("Will Trump make America Great again?");
				int answerAI = rndQuestion.RollDice(2);
				if(answerAI==1)
				{
					answer=true;
				}
				else
				{
					answer=false;
				}
			return answer;
		default:
			System.out.println("Water spirals down the plughole in opposite directions in the northern and southern hemispheres?");
			return false;
		}}
	public boolean Tough(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("Lightning never strikes in the same place twice?");
			return false;
		case 1 :
			System.out.println("If you cry in space the tears just stick to your face?");
			return true;
		case 2 :
			System.out.println("If you cut an earthworm in half, both halves can regrow their body?");
			return false;
		default:
			System.out.println("Napoleon Bonaparte was extremely short");
			return false;
		}}
	public boolean Medium(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("Humans can distinguish between over a trillion different smells?");
			return true;
		case 1 :
			System.out.println("There are more cells of bacteria in your body than there are human cells?");
			return true;
		case 2 :
			System.out.println("Twinkies have an infinite shelf life?");
			return false;
		default:
			System.out.println("Humans can’t breathe and swallow at the same time?");
			return true;
		}}
	public boolean Easy(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("Adults have fewer bones than babies do?");
			return true;
		case 1 :
			System.out.println("Goldfish only have a memory of three seconds?");
			return false;
		case 2 :
			System.out.println("Your fingernails and hair keep growing after you die");
			return false;
		default:
			System.out.println("Birds are dinosaurs?");
			return true;
		}}
	public boolean VeryEasy(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("It costs the U.S. Mint more to make pennies and nickels than the coins are actually worth?");
			return true;
		case 1 :
			System.out.println("Is the ocean blue?");
			return true;
		case 2 :
			System.out.println("DevCodeCamp rocks?");
			return true;
		default:
			System.out.println("Whales are mammals?");
			return true;
		}}
}