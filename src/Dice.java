import java.util.Random;
public class Dice {
	int diceOutCome;
	int numberOfSides;
	Random rand = new Random();
	public Dice(){
		
	}
		public int RollDice(int NumberOfSides){
			numberOfSides = NumberOfSides;
			diceOutCome = rand.nextInt(NumberOfSides) + 1;
			return diceOutCome*10;
		}
		
}

