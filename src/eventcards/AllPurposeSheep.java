package eventcards;

import java.util.Scanner;
import game.CardDescriptions;
import game.CardFactory;
import game.CardNames;

// every event card extends EventCard
public class AllPurposeSheep extends EventCard {
	
	private Scanner userInput = new Scanner(System.in);
	private CardFactory cardFactory = new CardFactory();

	// every EventCard sublcass is constructed like this
	// calls the superclass' constructor,
	// which sets the card's name and description to the one in the corresponding "info" class
	public AllPurposeSheep() {
		super(CardNames.AP_SHEEP, CardDescriptions.AP_SHEEP);

	}

	// takes input, and plays the given card
	@Override
	public void playCard(int status) {
		System.out.print("Enter card to play: ");
		EventCard newCard = cardFactory.createCard(userInput.nextLine());
		if (newCard != null) {
			newCard.playCard(2);
		}
		// most EventCards call the superclass' playCard method, 
		// which evaluates the status(described in EventCard.java),
		// and removes the card from the appropriate place.
		super.playCard(status);
	}

}
