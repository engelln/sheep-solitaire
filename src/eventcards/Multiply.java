package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;
import game.SheepValues;

public class Multiply extends EventCard {

	public Multiply(){
		super(CardNames.MULTIPLY,CardDescriptions.MULTIPLY);
	}

	@Override
	public void playCard(int status) {
		
		if(SheepGame.getSheepField().getNumberOfCards() == SheepGame.getSheepField().getField().length) {
			SheepGame.getSheepField().removeSheep(SheepGame.getSheepField().findLowestValue());
		}
		SheepGame.getSheepField().addCard(SheepValues.VALUE_THREE);
		
		super.playCard(status);
	}
	
	
	
}
