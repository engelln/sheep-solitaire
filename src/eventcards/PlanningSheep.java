package eventcards;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;
import java.util.Scanner;

public class PlanningSheep extends EventCard {
	
	private Scanner userInput = new Scanner(System.in);

	public PlanningSheep(){
		super(CardNames.PLANNING_SHEEP,CardDescriptions.PLANNING_SHEEP);
	}

	@Override
	public void playCard(int status) {
		System.out.println("\nEnter a card in your hand to remove from the game: ");
		String cardToRemove = userInput.nextLine();
		
		for(EventCard card : SheepGame.getPlayerHand().getCards()) {
			if (card.getName().equalsIgnoreCase(cardToRemove)) {
				SheepGame.getPlayerHand().removeCard(card);
				break;
			}
		}
		
		super.playCard(status);
	}
	
	
}
