package eventcards;

// bugged
import java.util.Scanner;

import game.CardDescriptions;
import game.CardNames;
import game.SheepGame;

public class SheepDog extends EventCard {
	
	private Scanner userInput = new Scanner(System.in);

	public SheepDog(){
		super(CardNames.SHEEP_DOG,CardDescriptions.SHEEP_DOG);
	}

	@Override
	public void playCard(int status) {
		System.out.print("Enter a card to discard: ");
		String discardCard = userInput.nextLine();
		
		for(EventCard card : SheepGame.getPlayerHand().getCards()) {
			if(card != null) {
				if(card.getName().equalsIgnoreCase(discardCard)) {
					SheepGame.getPlayerHand().removeCard(card);
					SheepGame.getDiscardDeck().addCard(card);
					break;
				}
			}
		}
		super.playCard(status);
	}
	
	
}
