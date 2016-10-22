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
	}

	public void newGame(boolean I_start) {
		scoreMine = 0;
		scoreEnemy = 0;
		responses.clear();
		this.I_start = I_start;
	}

	public void enemyResponse(Integer response) {
		responses.add(response);
	}

	public Integer makeChoice() {
		Integer choice;
		if (responses.size() == 0 && I_start) {
			choice = 1;
		} else {
			Integer lastResponse = responses.get(responses.size() - 1);
			choice = lastResponse;
		}
		choices.add(choice);
		return choice;
	}
}
