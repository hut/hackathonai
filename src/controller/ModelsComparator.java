package controller;

import model.AppModel;
import strategies.DifferentStrategy;
import strategies.WetForWetStrategy;

public class ModelsComparator {
	
	AppModel first;
	AppModel second;
	
	public ModelsComparator() {
		first = new WetForWetStrategy();
		second = new DifferentStrategy();
	}
	
	public void compare() {
		Integer turnsNumber = 1000;
		
		for(int i = 0; i < turnsNumber; i++) {
			Integer firstPlayerChoice = first.makeChoice();
			Integer secondPlayerChoice = second.makeChoice();
			first.enemyResponse(secondPlayerChoice);
			second.enemyResponse(firstPlayerChoice);
		}

	}

}
