package game;

import java.util.ArrayList;
import eventcards.EventCard;

// class for creating the discard deck, 
// which is a pile for cards to be placed in once played
public class DiscardDeck {
	
	// number of cards the discard deck can hold (length of the event deck)
	private int numberOfSlots = 22;

	// the actual discard pile is an array list
	private ArrayList<EventCard> discardPile = new ArrayList<>();
	
	// adds a card onto the discard pile
	public void addCard(EventCard card) {
		if(discardPile.size() < numberOfSlots) {
			discardPile.add(card);
		}
	}
	
	// removes all cards from the discard pile and returns them in an array list
	// so they can be added back to the event card deck
	public ArrayList<EventCard> emptyDeck() {
		ArrayList<EventCard> returnPile = new ArrayList<>();
		while(discardPile.size() > 0) {
			returnPile.add(discardPile.remove(0));
		}
		return returnPile;
	}
	
	// gets the number of cards in the discard pile
	public int getDiscardDeckLength() {
		return discardPile.size();
	}
}
