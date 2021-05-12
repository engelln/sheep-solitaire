package eventcards;

import game.CardDescriptions;
import java.util.Scanner;
import game.CardNames;
import game.SheepGame;
import game.SheepValues;

public class Flourish extends EventCard {
	
	private Scanner userInput = new Scanner(System.in);
	
	public Flourish(){
		super(CardNames.FLOURISH,CardDescriptions.FLOURISH);
	}

	@Override
	public void playCard(int status) {
		// pretty much reverse dominion
		
		int freeSlots = SheepGame.getSheepField().getField().length - SheepGame.getSheepField().getNumberOfCards();
		
		
		System.out.print("Enter a card to de-rank: ");
		int derank = userInput.nextInt();
		
		SheepGame.getSheepField().removeSheep(derank);
		if(derank != 1) {
			if(freeSlots >= 3) {
				for(int i = 0; i < 3; i++) {
					SheepGame.getSheepField().addCard(SheepValues.getValueIndex(derank - 1));
				}
			}
			else {
				for(int i = 0; i < freeSlots; i++) {
					SheepGame.getSheepField().addCard(SheepValues.getValueIndex(derank - 1));
				}
			}
		}
		
		
		super.playCard(status);
		
	}
	
	

}
