package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;
import game.SheepValues;

public class Plague extends EventCard {

	public Plague(){
		super(CardNames.PLAGUE,CardDescriptions.PLAGUE);
	}

	@Override
	public void playCard(int status) {
		int valueToRelease = 0;
		// check for each value, starting at the lowest, and break once it has at least 1 in that category
		for(int value : SheepValues.getValues()) {
			if(SheepGame.getSheepField().getCount(value) > 0) {
				valueToRelease = value;
				break;
			}
		}
		
		for(int i = 0; i < SheepGame.getSheepField().getField().length; i++) {
			SheepGame.getSheepField().removeSheep(valueToRelease);
		}
		super.playCard(status);
	}
	
	
	
}
