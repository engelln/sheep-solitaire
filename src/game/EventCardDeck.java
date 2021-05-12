package game;
// need 2 arrays
// 1 is the event deck
// 1 is the discard pile
// event deck needs to be shuffleable

// this will be used to shuffle
import java.util.Collections;
import java.util.ArrayList;
import eventcards.EventCard;

// class for creating the deck for holding the event cards
public class EventCardDeck {
	
	// 22 slots in each for 22 event cards
	private int numberOfSlots = 22;
	
	// the event deck is an array list
	private ArrayList<EventCard> eventDeck = new ArrayList<>();
	
	// when constructed, the deck gets filled and shuffled
	public EventCardDeck() {
		fillEventCardDeck();
		this.shuffleDeck();
	}
	
	// puts all cards from the CardArray class into the event deck
	private void fillEventCardDeck() {
		for(EventCard card : CardArray.getEventCards()) {
			eventDeck.add(card);
		}
		
	}

	// getter for the event deck
	public ArrayList<EventCard> getEventDeck() {
		return eventDeck;
	}
	
	// getter for the number of cards in the event deck
	public int getEventDeckLength() {
		return eventDeck.size();
	}

	// shuffles the cards in the deck 
	// using a method from the java.util.Collections class
	public void shuffleDeck() {
		Collections.shuffle(eventDeck);
	}
	
	// takes the top card off of the deck and returns it
	public EventCard dealCard() {
		return eventDeck.remove(0);
	}
	
	// adds a card onto the deck
	public void addCard(EventCard card) {
		if(eventDeck.size() < numberOfSlots) {
			eventDeck.add(card);
		}
	}
	
	// adds cards from an array list onto the deck
	public void addCards(ArrayList<EventCard> cards) {
		if(eventDeck.size() < numberOfSlots) {
			for (EventCard card : cards) {
				eventDeck.add(card);
			}
		}
	}
	
	// removes a given card from the deck
	public void removeCard(EventCard ec) {
		eventDeck.remove(ec);
	}

}
