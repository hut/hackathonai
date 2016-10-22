package strategies;

import model.AppModel;

public class AlwaysCooperateStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		Integer choice = 1;
		choices.add(choice);
		return choice;
	}
}
