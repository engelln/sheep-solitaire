package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;
import game.SheepValues;

public class Wolves extends EventCard {

	public Wolves(){
		super(CardNames.WOLVES,CardDescriptions.WOLVES);
	}

	@Override
	public void playCard(int status) {
		int highestCardValue = SheepGame.getSheepField().findHighestValue();
		
		SheepGame.getSheepField().removeSheep(highestCardValue);
		if(highestCardValue != 1) {
			SheepGame.getSheepField().addCard(SheepValues.getValues()[SheepValues.getValueIndex(highestCardValue) - 1]);
		}
	
		super.playCard(status);
	}
	
	
	
}
