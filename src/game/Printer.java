package game;

import eventcards.EventCard;

// this class handles most of the game's print and println statements
public class Printer {

	// prints out the game board - hand, field, round, cards remaining
	// static because if any class will be printing the game, they will all be printing the same one
	public static void printGame() {
		
		System.out.println("\nRound: " + SheepGame.getRound());
		System.out.println("Event Cards remaining: " + SheepGame.getEventCardDeck().getEventDeckLength());
		System.out.println("Cards in discard pile: " + SheepGame.getDiscardDeck().getDiscardDeckLength());
		
		System.out.println();
		
		System.out.print("Sheep Cards: ");
		for(SheepCard sheep : SheepGame.getSheepField().getField()) {
			if(sheep != null) {
				System.out.print(sheep.getValue() + "   ");
			}

		}
		
		System.out.println("\n");
		
		System.out.print("Hand: ");
		for(EventCard card : SheepGame.getPlayerHand().getCards()) {
			System.out.print(card.getName() + "   ");
		}
		
		System.out.println();
		
		
	}
	
	// message printed out when the game starts
	public static void printIntro() {
		
		System.out.println("Welcome to Shephy.\nType the name of a card to play it,\nor type \"description (card name)\" to see a card's description.");
		
	}
	
	// prints the cards currently in the event deck
	public static void printEventDeck() {
		for(EventCard ec : SheepGame.getEventCardDeck().getEventDeck()) {
			System.out.print(ec.getName() + "   ");
		}
	}

	// prints out if the user won or not
	public static void printWin(boolean win) {
		printGame();
		if(win) {
			System.out.println("You win!");
		}
		else {
			System.out.println("You lose!");
		}
		
	}
	


}
