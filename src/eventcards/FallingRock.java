package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepField;
import game.SheepGame;

public class FallingRock extends EventCard {
	
	public FallingRock(){
		super(CardNames.FALLING_ROCK,CardDescriptions.FALLING_ROCK);
	}

	@Override
	public void playCard(int status) {
		//Release lowest value sheep card.
		//keep track of the lowest value and its index in the field
		//loop through the field and find these two
		//remove the card that has the lowest value
		
		SheepField theField = SheepGame.getSheepField();
		int lowestIndex = theField.findLowestValueIndex();
		
		theField.getField()[lowestIndex] = null;
		
		super.playCard(status);
	}
	
	

}
