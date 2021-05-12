package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class Slump extends EventCard {

	public Slump(){
		super(CardNames.SLUMP,CardDescriptions.SLUMP);
	}

	@Override
	public void playCard(int status) {
		int cardsToRelease = Math.floorDiv(SheepGame.getSheepField().getNumberOfCards(), 2);
		
		for(int i = 0; i < cardsToRelease; i++) {
			SheepGame.getSheepField().getField()[SheepGame.getSheepField().findLowestValueIndex()] = null;
		}
		super.playCard(status);
	}
	
	
}
