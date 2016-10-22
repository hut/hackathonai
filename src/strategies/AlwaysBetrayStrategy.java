package strategies;

import model.AppModel;

public class AlwaysBetrayStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		return 2;
	}
}
