package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class GoldenHooves extends EventCard {

	public GoldenHooves(){
		super(CardNames.GOLDEN_HOOVES,CardDescriptions.GOLDEN_HOOVES);
	}

	@Override
	public void playCard(int status) {
		
		//Raise the rank of all Sheep cards, except for your highest ranking card.
		// find the highest index
		// upgrade all cards except that index
		
		int highestIndex = SheepGame.getSheepField().findHighestValueIndex();
		
		for(int i = 0; i < SheepGame.getSheepField().getField().length; i++) {
			if(SheepGame.getSheepField().getField()[i] != null) {
				if(i != highestIndex) {
					SheepGame.getSheepField().levelUpSheep(i);
				}
			}
		}
		
		super.playCard(status);
	}
	
	
}
