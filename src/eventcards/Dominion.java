package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepField;
import game.SheepGame;
import game.SheepValues;

public class Dominion extends EventCard {

	public Dominion(){
		super(CardNames.DOMINION,CardDescriptions.DOMINION);
	}

	@Override
	public void playCard(int status) {
		SheepField field = SheepGame.getSheepField();

		int ones = field.getCount(SheepValues.VALUE_ONE);
		int threes = field.getCount(SheepValues.VALUE_THREE);
		int tens = field.getCount(SheepValues.VALUE_TEN);
		int thirties = field.getCount(SheepValues.VALUE_THIRTY);
		int hundreds = field.getCount(SheepValues.VALUE_HUNDRED);
		int threeHundreds = field.getCount(SheepValues.VALUE_THREE_HUNDRED);
		int[] sheepCounts = {ones, threes, tens, thirties, hundreds, threeHundreds};

		// for each type of sheep value
		for(int i = 0; i < sheepCounts.length; i++) {
			// while the current value is bigger than 3
			while(sheepCounts[i] > 2) {
				// remove 3 equal value cards
				for(int j = 0; j < 3; j++) {
					field.removeSheep(SheepValues.getValues()[i]);
				}
				//and add 1 value higher
				field.addCard(SheepValues.getValues()[i + 1]);
				sheepCounts[i] -= 3;
			}
		}

		super.playCard(status);

		// Wherever there are 3 equal value Sheep cards in the Field, add their values and then replace them with one Sheep card of equal value.
		// repeat for every value of card besides 1000 until there are less than 3 of each card type
		// check if a card value has at least 3 of a kind
		// if so then remove three of those value cards from the field
		// add one card equal to their value


	}
}
