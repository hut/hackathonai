package strategies;

import model.AppModel;

public class AlwaysLieStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		return 2;
	}
}
