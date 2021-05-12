package eventcards;

import game.SheepGame;

//superclass for every event card

public class EventCard {

	// every event card will have a name and description
	private String name = "No name";
	private String description = "No Description";
	
	// this constructor is used by all the subclasses
	public EventCard(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}


	public void playCard(int status) {
		
		// normal status, used when playing a card from the hand
		if(status == 0) {
			// removes card from the hand and adds to the discard pile
			SheepGame.getDiscardDeck().addCard(this);
			SheepGame.getPlayerHand().removeCard(this);
		}
		
		// status for inspiration card, when you play a card from the event deck
		else if(status == 1) {
			// removes card from the event deck and adds to discard pile
			SheepGame.getDiscardDeck().addCard(this);
			SheepGame.getEventCardDeck().removeCard(this);
		}
		
		// status for all purpose sheep, only plays card and doesn't put it anywhere
		else if(status == 2) {
			// Doesn't remove a card from anywhere, doesn't add a card anywhere
		}
		
	}
	

}
