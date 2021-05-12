package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class Shephion extends EventCard {

	public Shephion(){
		super(CardNames.SHEPHION,CardDescriptions.SHEPHION);
	}

	@Override
	public void playCard(int status) {
		SheepGame.getSheepField().emptyfield();
		super.playCard(status);
	}
	
	
	
}
