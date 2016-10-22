package model;

import java.util.ArrayList;
import java.util.List;

public class AppModel {
	List<Integer> responses, choices;
	Integer scoreEnemy, scoreMine;
	boolean I_start;
	
	public AppModel() {
		responses = new ArrayList<Integer>();
		choices = new ArrayList<Integer>();
		newGame();
	}

	public void newGame() {
		scoreMine = 0;
		scoreEnemy = 0;
		responses.clear();
		choices.clear();
	}

	public void enemyResponse(Integer response) {
		responses.add(response);
	}

	public Integer makeChoice() {
		Integer choice;
		if (responses.size() == 0) {
			choice = 1;
		} else {
			Integer lastResponse = responses.get(responses.size() - 1);
			choice = lastResponse;
		}
		if (choice == 3) {
			choice = 2;
		}
		choices.add(choice);
		return choice;
	}
}
