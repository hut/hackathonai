package controller;

import model.AppModel;
import strategies.AlwaysCooperateStrategy;
import strategies.BetrayLastStrategy;
import strategies.WetForWetStrategy;

public class StrategiesComparator {
	
	AppModel first;
	AppModel second;
	
	public StrategiesComparator(AppModel first, AppModel second) {
		this.first = first;
		this.second = second;
	}
	
	public static void main(String[] args) {
		StrategiesComparator comparator = new StrategiesComparator(new BetrayLastStrategy(), new WetForWetStrategy());
		comparator.compare(6);
		
		StrategiesComparator comparator2 = new StrategiesComparator(new WetForWetStrategy(), new AlwaysCooperateStrategy());
		comparator2.compare(6);
	}
	
	public void compare(int turnsNumber) {
		
		for(int i = 0; i < turnsNumber; i++) {
			Integer firstPlayerChoice = first.makeChoice();
			Integer secondPlayerChoice = second.makeChoice();
			first.enemyResponse(secondPlayerChoice);
			second.enemyResponse(firstPlayerChoice);
			first.nextRound();
			second.nextRound();
		}

		System.out.println(first.getClass().getName() + " score: " + first.getMyScore());
		System.out.println(second.getClass().getName() + " score: " + second.getMyScore());

		System.out.println(first.getClass().getName() + " score: " + second.getEnemyScore());
		System.out.println(second.getClass().getName() + " score: " + first.getEnemyScore());

	}

}
