package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class Meteor extends EventCard {

	public Meteor(){
		super(CardNames.METEOR,CardDescriptions.METEOR);
	}

	@Override
	public void playCard(int status) {
		for(int i = 0; i < 3; i++) {
			int highestValueIndex = SheepGame.getSheepField().findHighestValueIndex();
			SheepGame.getSheepField().getField()[highestValueIndex] = null;
		}
		if(status == 0 || status == 1) {
			SheepGame.getPlayerHand().removeCard(this);
		}
	}
	
	
	
}
