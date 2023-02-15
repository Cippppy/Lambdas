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
	
	public static HashMap<Integer, Consumer<Player>> squareAction = new HashMap<Integer, Consumer<Player>>();
	static {
		squareAction.put(1, pName -> pName.setGpa(pName.getGpa() * 0.9));
		squareAction.put(2, pName -> pName.setHappiness(pName.getHappiness() + 5));
		squareAction.put(3, pName -> pName.setMoney(pName.getMoney() - 200));
		squareAction.put(4, pName -> {pName.setHappiness(pName.getHappiness() + 10); pName.setGpa(pName.getGpa() - 0.2);});
		squareAction.put(5, pName -> {pName.setHappiness(pName.getHappiness() - 3); pName.setGpa(pName.getGpa() + 0.1);});
		squareAction.put(6, pName -> pName.move(2));
		squareAction.put(7, pName -> pName.setNumberOfClubs(pName.getNumberOfClubs() + 1));
		squareAction.put(8, pName -> pName.setNumberOfFriends(pName.getNumberOfFriends() + 1));
		squareAction.put(9, pName -> pName.setGpa(pName.getGpa() * 1.2));
		squareAction.put(10, pName -> {pName.setNumberOfFriends(pName.getNumberOfFriends() + 2); pName.setMoney(pName.getMoney() - 200);});
		squareAction.put(11, pName -> {pName.setMoney(pName.getMoney() - 100); pName.setGpa(pName.getGpa() - 0.5);});
		squareAction.put(12, pName -> pName.setMoney(pName.getMoney() + 220));
		squareAction.put(13, pName -> pName.setNumberOfFriends(pName.getNumberOfFriends() - 1));
		squareAction.put(14, pName -> pName.setNumberOfClubs(pName.getNumberOfClubs() + 1));
		squareAction.put(15, pName -> {pName.setGpa(pName.getGpa() + 0.8); pName.setMoney(pName.getMoney() + 2000);});
		squareAction.put(16, pName -> {pName.move(-3); pName.setGpa(pName.getGpa() - 0.5);});
		squareAction.put(17, pName -> pName.setHappiness(pName.getHappiness() - 12));
		squareAction.put(18, pName -> {pName.setHappiness(pName.getHappiness() + 10); pName.setMoney(pName.getMoney() + 1000);});
		squareAction.put(19, pName -> pName.setGpa(pName.getGpa() + 1));
		squareAction.put(20, pName -> pName.setNumberOfFriends(pName.getNumberOfFriends() + 2));
		squareAction.put(21, pName -> pName.setMoney(pName.getMoney() - 300));
		squareAction.put(22, pName -> {pName.setHappiness(pName.getHappiness() - 7); pName.setGpa(pName.getGpa() + 0.3);});
		squareAction.put(23, pName -> {pName.setGpa(pName.getGpa() * 0.8); pName.setMoney(pName.getMoney() - 400);});
		squareAction.put(24, pName -> {pName.setMoney(pName.getMoney() + 150); pName.setNumberOfFriends(pName.getNumberOfFriends() - 1);});
		squareAction.put(25, pName -> {pName.setMoney(pName.getMoney() + 750); pName.setHappiness(pName.getHappiness() + 15);});
	}

	public static int roll() {
	   return (int)(Math.random()*6+1);
	}

}
