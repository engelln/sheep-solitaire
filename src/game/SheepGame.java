package game;

import java.util.Scanner;
import eventcards.EventCard;

// this class serves as the game engine
public class SheepGame {
	
	// every game needs a sheep field, hand, event card deck, and a discard deck
	// they are static for a few reasons
	// 1. they should have the same cards for every class that is using them while the game is running
	// 2. the game does not have to be passed as a parameter to every event card
	// 3. There only should be 1 instance of the sheep game class
	private static SheepField sheepField;
	private static PlayerHand playerHand;
	private static EventCardDeck eventDeck;
	private static DiscardDeck discardDeck;
	
	// used to keep track of the round
	// also stays the same for all classes
	private static int round;
	// used to track if the game is over or not
	private boolean gameOver = false;
	
	// used to track if the player won or not
	private boolean win = false;
	
	private Scanner userInput = new Scanner(System.in);
	
	// the constructor essentially starts the game
	public SheepGame() {
		// starts game at round 1
		round = 1;
		// initializing the "decks"
		sheepField = new SheepField();
		playerHand = new PlayerHand();
		eventDeck = new EventCardDeck();
		discardDeck = new DiscardDeck();
		
		// print the introduction message
		Printer.printIntro();
		
		// runs the game until its over
		gameLoop();
		
		// checks if the user won or not
		checkForWin();
		
		// prints if they won or lost
		Printer.printWin(win);

	}
	
	// this method will loop until the game is over
	// it is what runs the game
	private void gameLoop() {
		// repeat until the end of the game
		while(!gameOver) {
			// fill the users hand with cards
			fillHand();
			//print out hand and field stats
			// ask user to play a card
			Printer.printGame();
			// perform the cards action
			handleInput(userInput.nextLine());
			
			// see if the game is over yet
			gameOver = checkForGameOver();
		}
	}
	
	
	// checks if the user has more than 1000 sheep and if not they lose
	private void checkForWin() {
		if(sheepField.getNumberOfSheep() >= 10) {
			win = true;
		}
		
	}

	// handles the input, user can either get a card description or play the card
	private void handleInput(String userInput) {
		// checks if the word "description" is in the input
		if(userInput.toLowerCase().contains("description")) {
			String card = userInput.substring(12);
			// prints out the description, kind of pointless to move to the printer class
			System.out.println(playerHand.getCardDescription(card));
		}
		else {
			playCard(userInput);
		}
		
		
	}
	
	// this playCard method is used to run the playCard method of the card name that the user enters
	public void playCard(String card) {
		for(EventCard ec : playerHand.getCards()) {
			if (ec.getName().equalsIgnoreCase(card)) {
				
				ec.playCard(0);
				break;
				 
			}

		}
		
	}

	
	// fills the userHand with cards
	private void fillHand() {
		// while there are still cards in the event deck, we can fill the hand with cards
		if(eventDeck.getEventDeckLength() > 0) {
			while(playerHand.getPlayerHandLength() < playerHand.getNumberOfHandSlots()) {
				playerHand.addCard(eventDeck.dealCard());
				
			}
		}
		
		// if the hand is empty, that means no more cards are in the event deck, so empty the discard deck
		if(playerHand.getCards().size() == 0) {
			emptyDiscardDeck();
		}

	}

	// responsible for removing cards from the discard deck and putting them back in the event deck
	// every time this happens, the round advances and the event deck is shuffled
	private void emptyDiscardDeck() {
		eventDeck.addCards(discardDeck.emptyDeck());
		eventDeck.shuffleDeck();
		round++;
		
	}
	
	// checks and returns if the game is over
	// can only be over if the field runs out of sheep
	// or it is past round 3
	private boolean checkForGameOver(){
		if(round > 3 || sheepField.getNumberOfSheep() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// some getters
	public static PlayerHand getPlayerHand() {
		return playerHand;
	}
	
	public static EventCardDeck getEventCardDeck() {
		return eventDeck;
	}

	public static DiscardDeck getDiscardDeck() {
		return discardDeck;
	}

	public static SheepField getSheepField() {
		return sheepField;
	}
	
	public static int getRound() {
		return round;
	}

	
}
