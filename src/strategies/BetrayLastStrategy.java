package strategies;

import java.util.Random;

import model.AppModel;

public class BetrayLastStrategy extends AppModel {
	Integer ourNumber = 3;
	Integer enemyNumber;
	
	@Override
	public void newGame() {
		super.newGame();
		Random rnd = new Random();
		enemyNumber = rnd.nextInt(4) + 2; // random int between 2-5
	}
	
	@Override
	public Integer makeChoice() {
		if (getNumberOfRounds() < ourNumber + enemyNumber) {
			return super.makeChoice();
		}
		else {
			/* betray on the predicted last round */
			choices.add(2);
			return 2;
		}
	}
}
