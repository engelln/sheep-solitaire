package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepCard;
import game.SheepGame;
import game.SheepValues;

public class FillTheEarth extends EventCard {



	public FillTheEarth(){
		super(CardNames.FILL_THE_EARTH,CardDescriptions.FILL_THE_EARTH);
	}
	
	
	
	@Override
	public void playCard(int status) {
		// add a 1 sheep sheepcard anywhere thats not full in the field
		for(int i = 0; i < SheepGame.getSheepField().getField().length; i++) {
			if(SheepGame.getSheepField().getField()[i] == null) {
				SheepGame.getSheepField().getField()[i] = new SheepCard(SheepValues.VALUE_ONE);
				
			}
		}
		super.playCard(status);
	}
}
