package eventcards;


import game.CardDescriptions;
import game.CardNames;
import game.SheepField;
import game.SheepGame;

public class Crowding extends EventCard {

	public Crowding(){
		super(CardNames.CROWDING,CardDescriptions.CROWDING);
	}

	@Override
	public void playCard(int status) {
		// go through the array and find the two highest sheep cards
		// store them somewhere
		// clear the rest of the array
		// put those 2 back in the array
		
		SheepField theField = SheepGame.getSheepField();
		int highestValue = theField.findHighestValue();
		int highestValueIndex = theField.findHighestValueIndex();
		theField.getField()[highestValueIndex] = null;
		int secondHighest = -1;
		if(theField.getNumberOfCards() > 0) {
			secondHighest = theField.findHighestValue();
			int secondHighestIndex = theField.findHighestValueIndex();
			theField.getField()[secondHighestIndex] = null;
		}
		theField.emptyfield();
		theField.addCard(highestValue);
		if(secondHighest != -1) {
			theField.addCard(secondHighest);
		}
		super.playCard(status);
		
		
	}
	
	
}
