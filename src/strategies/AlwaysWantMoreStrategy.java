package strategies;

import model.AppModel;

public class AlwaysWantMoreStrategy extends AppModel{

	@Override
	public Integer makeChoice() {
		choices.add(3);
		return 3;
	}
}
