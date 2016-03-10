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
	boolean UserAnswer = true;
	try
	{
		UserAnswer = scanner.nextBoolean();	}
	catch(Exception e)
	{
		UserAnswer=false;
	}
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
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("Popeye’s nephew’s were called Peepeye, Poopeye, Pipeye and Pupeye?");
			return true;
		case 4 :
			System.out.println("Fluorine has an atomic number of 10?");
			return false;
		case 5 :
			System.out.println("A man from the USA consumed his 26,000th Big Mac on 11th October 2012, after eating at least one a day for forty years. (11th October 2012)?");
			return true;
		case 6 :
			System.out.println("Though it is difficult, you are able to start a fire by rapidly rubbing two cool ranch doritos together for a long period of time.?");
			return true;
		case 7 :
			System.out.println("Almonds are members of the peach family?");
			return true;
		case 8 :
			System.out.println("The word four has four letters. In the English language there is no other number whose number of letters is equal to its value?");
			return true;
		default:
			System.out.println("The owner of the company that makes Segways died after accidentally driving his Segway off a cliff?");
			return true;
		}}
	public boolean Hard(){
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("There is a planet that rains glass sideways?");
			return true;
		case 4 :
			System.out.println("Jupiter is the sixth planet from the sun?");
			return false;
		case 5 :
			System.out.println("Michael Jackson had a pet python called ‘Crusher’?");
			return true;
		case 6 :
			System.out.println("Every day more money is printed for monopoly than the US Treasury?");
			return true;
		case 7 :
			System.out.println("A polar bears skin is black?");
			return true;
		case 8 :
			System.out.println("In ancient Egypt, Priests plucked every hair from their bodies, including their eyebrows and eyelashes?");
			return true;
		default:
			System.out.println("Water spirals down the plughole in opposite directions in the northern and southern hemispheres?");
			return false;
		}}
	public boolean Tough(){
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("You can lead a cow down stairs but not upstairs?");
			return false;
		case 4 :
			System.out.println("The average person will shed 40 pounds of skin during their lifetime?");
			return true;
		case 5 :
			System.out.println("Fauntleroy’ is the middle name of Donald Duck?");
			return true;
		case 6 :
			System.out.println("A cockroach will live for nine days without it's head, before it starves to death?");
			return true;
		case 7 :
			System.out.println("Monkeys are related to fish because if need be they can breathe underwater?");
			return false;
		case 8 :
			System.out.println("The opposite sides of a dice cube always add up to seven?");
			return true;
		default:
			System.out.println("Napoleon Bonaparte was extremely short?");
			return false;
		}}
	public boolean Medium(){
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("Some turtles can breathe through their butts?");
			return true;
		case 4 :
			System.out.println("Sneezes regularly exceed 100 m.p.h?");
			return true;
		case 5 :
			System.out.println("Alliumphobia is a fear of garlic?");
			return true;
		case 6 :
			System.out.println("Seoul is the capital of North Korea?");
			return false;
		case 7 :
			System.out.println("Singing in the shower lowers your cholesterol, heart rate and risk of cancer and heart disease?");
			return false;
		case 8 :
			System.out.println("The first product Coke made was coke?");
			return false;
		default:
			System.out.println("Humans can’t breathe and swallow at the same time?");
			return true;
		}}
	public boolean Easy(){
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("Mark Twain invented the bra strap clasp?");
			return true;
		case 4 :
			System.out.println("Virtually all Las Vegas gambling casinos ensure that they have no clocks?");
			return true;
		case 5 :
			System.out.println("Hotmail was launched in 1996?");
			return true;
		case 6 :
			System.out.println("There is no word that rhymes with Orange?");
			return true;
		case 7 :
			System.out.println("In the weightlessness of space, if a frozen pea touches pepsi it will blow up?");
			return true;
		case 8 :
			System.out.println("No piece of paper can be folded in half more than 7 times?");
			return true;
		default:
			System.out.println("Birds are dinosaurs?");
			return true;
		}}
	public boolean VeryEasy(){
		int selectQuestion = rndQuestion.RollDice(10);
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
		case 3 :
			System.out.println("Google was originally called 'BackRub'?");
			return true;
		case 4 :
			System.out.println("The world’s tallest living man is 251cm / 8 ft 3 in. (9th February 2011)?");
			return true;
		case 5 :
			System.out.println("The ‘black box’ in an aeroplane is black?");
			return false;
		case 6 :
			System.out.println("The inventor of the light bulb, Thomas Edison, was afraid of the dark?");
			return true;
		case 7 :
			System.out.println("The worlds smartest pig memorized the multiplucation tabled up to 12?");
			return true;
		case 8 :
			System.out.println("The strongest muscle in the body is our tongues?");
			return true;
		default:
			System.out.println("Whales are mammals?");
			return true;
		}}
}