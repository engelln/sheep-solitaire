package game;

import java.util.ArrayList;
import eventcards.EventCard;


// class for holding the cards in the player's hand
public class PlayerHand {
	
	// how many slots the hand has
	private int numberOfSlots = 5;

	// the hand is an array list
	private ArrayList<EventCard> playerHand = new ArrayList<>();
	
	// add a card to the hand
	public void addCard(EventCard card) {
		if(playerHand.size() < numberOfSlots) {
			playerHand.add(card);
		}
	}
	
	// get the number of cards in the hand
	public int getPlayerHandLength() {
		return playerHand.size();
	}
	
	// get the number of slots for cards in the hand
	public int getNumberOfHandSlots() {
		return numberOfSlots;
	}
	
	// get the array list of cards in the hand
	public ArrayList<EventCard> getCards(){
		return playerHand;
	}
	
	// get the description of the given card
	public String getCardDescription(String cardName) {
		String returnString = "Not found";
		for (EventCard card : playerHand) {
			if(card.getName().equalsIgnoreCase(cardName)){
				returnString = card.getDescription();
				break;
			}
		}
		return returnString;
	}

	// remove a card from the hand
	public void removeCard(EventCard ec) {
		playerHand.remove(ec);
	}
}
