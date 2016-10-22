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
		enemyNumber = 3 - ((rnd.nextInt(5) + 1) / 5); /* 3 minus (1 in 20% of the times, otherwise 0) */
	}
	
	@Override
	public Integer makeChoice() {
		if (getNumberOfRounds() + 1 < ourNumber + enemyNumber) {
			return super.makeChoice();
		}
		else {
			/* betray on the predicted last round */
			choices.add(2);
			return 2;
		}
	}
}
