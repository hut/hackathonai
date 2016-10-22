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
		enemyNumber = 3 - ((rnd.nextInt(3) + 1) / 3); /* 3 minus (1 in 33% of the times, otherwise 0) */
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
