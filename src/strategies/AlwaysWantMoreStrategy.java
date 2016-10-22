package strategies;

import model.AppModel;

public class AlwaysWantMoreStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		return 3;
	}
}
