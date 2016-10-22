package strategies;

import model.AppModel;

public class AlwaysCooperateStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		return 1;
	}
}
