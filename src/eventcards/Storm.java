package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class Storm extends EventCard {

	public Storm(){
		super(CardNames.STORM,CardDescriptions.STORM);
	}

	@Override
	public void playCard(int status) {
		if(SheepGame.getSheepField().getNumberOfCards() >= 2) {
			SheepGame.getSheepField().getField()[SheepGame.getSheepField().findLowestValueIndex()] = null;
			SheepGame.getSheepField().getField()[SheepGame.getSheepField().findLowestValueIndex()] = null;
		}
		else {
			SheepGame.getSheepField().getField()[SheepGame.getSheepField().findLowestValueIndex()] = null;
		}
		
		super.playCard(status);
	}
	
}
