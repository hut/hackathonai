package model;

import java.util.ArrayList;
import java.util.List;

public class AppModel {
	List<Integer> responses;
	protected List<Integer> choices;
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
	
	public void nextRound() {
		if (choices.size() == 0 || responses.size() == 0) {
			return;
		}
		Integer me = choices.get(choices.size() - 1);
		Integer he = responses.get(responses.size() - 1);
		if (me == 1) {
			if (he == 1) {
				scoreMine += 5;
				scoreEnemy += 5;
			}
			else if (he == 2) {
				scoreEnemy += 10;
			}
			else if (he == 3) {
				scoreMine += 4;
				scoreEnemy += 6;
			}
		}
		else if (me == 2 && he == 1) {
			scoreMine += 10;
		}
		else if (me == 3 && he == 1) {
			scoreMine += 6;
			scoreEnemy += 4;
		}
	}
	
	public Integer getMyScore() {
		return scoreMine;
	}
	
	public Integer getEnemyScore() {
		return scoreEnemy;
	}
	
	public Integer getNumberOfRounds() {
		return choices.size();
	}
}
