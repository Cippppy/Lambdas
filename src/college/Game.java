package college;

import java.util.HashMap;
import java.util.function.Consumer;

public class Game {
	
	public static final int NUMBER_OF_CLUBS = 0;
	public static final int NUMBER_OF_FRIENDS = 1;
	public static final int MONEY = 225;
	public static final int HAPPINESS = 20;
	public static final double GPA = 3.0;
	public static final int LAST_SQUARE = 26;
	
	public static HashMap<Integer, String> squareText = new HashMap<Integer, String>();
	static {
		squareText.put(1, "Fall asleep in class.");
		squareText.put(2, "Roommate comforts you.");
		squareText.put(3, "Roommate needs a loan.");
		squareText.put(4, "Skip class to travel to New York.");
		squareText.put(5, "Pull an all nighter.");
		squareText.put(6, "Move ahead two spaces.");
		squareText.put(7, "Join a club.");
		squareText.put(8, "Help classmate study.");
		squareText.put(9, "Kick ass on midterms.");
		squareText.put(10, "Throw major party.");
		squareText.put(11, "Get caught buying paper from web.");
		squareText.put(12, "Roommate pays you back - with interest!");
		squareText.put(13, "Lose a friend.");
		squareText.put(14, "Join a club.");
		squareText.put(15, "Turn research entrepeneurial.");
		squareText.put(16, "Fail DSA");
		squareText.put(17, "Dean discovers your illegal party.");
		squareText.put(18, "Win eSports tournament.");
		squareText.put(19, "Join Honors Club.");
		squareText.put(20, "Gain 2 friends.");
		squareText.put(21, "Robbed!");
		squareText.put(22, "Study hard for Calculus III.");
		squareText.put(23, "Senioritis!");
		squareText.put(24, "Borry money from friend; forget to repay.");
		squareText.put(25, "Get graduation gift from Aunt June.");
		squareText.put(26, "GRADUATED!");
	}
	
	

	public static int roll() {
	   return (int)(Math.random()*6+1);
	}

}
