package controller;

import model.AppModel;
import view.AppView;

public class AppController {

	AppView view;
	AppModel model;
	
	public AppController() {
		this.model = new AppModel();
		this.view = new AppView();
	}
	
	public void loop() {
		Integer turnsNumber = view.readTurnsNumber();
		
		for(int i = 0; i < turnsNumber; i++) {
			view.writeChoice(model.makeChoice());
			model.enemyResponse(view.readEnemyChoice());
		}
	}
}
