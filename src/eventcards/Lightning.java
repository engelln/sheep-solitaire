package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class Lightning extends EventCard {

	public Lightning(){
		super(CardNames.LIGHTNING,CardDescriptions.LIGHTNING);
	}

	@Override
	public void playCard(int status) {
		SheepGame.getSheepField().removeSheep(SheepGame.getSheepField().findHighestValue());
		super.playCard(status);
	}
	
	
	
}
