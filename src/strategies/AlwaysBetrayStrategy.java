package strategies;

import model.AppModel;

public class AlwaysBetrayStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		choices.add(2);
		return 2;
	}
}
