package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class BeFruitful extends EventCard {

	public BeFruitful(){
		super(CardNames.BE_FRUITFUL,CardDescriptions.BE_FRUITFUL);
	}

	@Override
	public void playCard(int status) {
		
		// go through the field
		//find the highest value sheep card
		// check if there is room for a card
		int highestValue = SheepGame.getSheepField().findHighestValue();
		int cardCount = SheepGame.getSheepField().getNumberOfCards();
		
		// add another one of those to the field if there is room
		if(cardCount < SheepGame.getSheepField().getField().length) {
			SheepGame.getSheepField().addCard(highestValue);
		}
		else {
			SheepGame.getSheepField().removeSheep(SheepGame.getSheepField().findLowestValue());
			SheepGame.getSheepField().addCard(highestValue);
		}
		super.playCard(status);
	}
	
	
}
