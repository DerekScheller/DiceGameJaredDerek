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
			System.out.println("");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
	public boolean Hard(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
	public boolean Tough(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("Lightning never strikes in the same place twice?");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
	public boolean Medium(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
	public boolean Easy(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
	public boolean VeryEasy(){
		int selectQuestion = rndQuestion.RollDice(4);
		switch (selectQuestion){
		case 0 :
			System.out.println("");
			return questionAnswer;
		case 1 :
			System.out.println("");
			return questionAnswer;
		case 2 :
			System.out.println("");
			return questionAnswer;
		default:
			System.out.println("");
			return questionAnswer;
		}}
}