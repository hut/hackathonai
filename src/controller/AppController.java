package controller;

import model.AppModel;
import strategies.BetrayLastStrategy;
import view.AppView;

public class AppController {

	AppView view;
	AppModel model;
	
	public AppController() {
		this.model = new BetrayLastStrategy();
		this.view = new AppView();
	}
	
	public void loop() {
		Integer turnsNumber = view.readTurnsNumber();
		
		for(int i = 0; i < turnsNumber; i++) {
			view.writeChoice(model.makeChoice());
			model.enemyResponse(view.readEnemyChoice());
			model.nextRound();
		}
		
		System.out.println(model.getClass().getName() + " score: " + model.getMyScore());
		System.out.println(model.getClass().getName() + " score: " + model.getMyScore());
	}
}
