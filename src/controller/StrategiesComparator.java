package controller;

import model.AppModel;
import strategies.AlwaysCooperateStrategy;
import strategies.WetForWetStrategy;

public class StrategiesComparator {
	
	AppModel first;
	AppModel second;
	
	public StrategiesComparator() {
		first = new WetForWetStrategy();
		second = new AlwaysCooperateStrategy();
	}
	
	public static void main(String[] args) {
		StrategiesComparator comparator = new StrategiesComparator();
		comparator.compare();
	}
	
	public void compare() {
		Integer turnsNumber = 1000;
		
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

	}

}
