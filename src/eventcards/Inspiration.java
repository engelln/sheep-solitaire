package eventcards;

import java.util.Scanner;

import game.CardDescriptions;
import game.CardNames;
import game.Printer;
import game.SheepGame;

public class Inspiration extends EventCard {
	
	private static Scanner userInput = new Scanner(System.in);

	public Inspiration(){
		super(CardNames.INSPIRATION,CardDescriptions.INSPIRATION);
	}

	@Override
	public void playCard(int status) {
		Printer.printEventDeck();
		System.out.println("\nPlay a card from the deck: ");
		String card = userInput.nextLine();
		
		for(EventCard ec : SheepGame.getEventCardDeck().getEventDeck()) {
			if (ec.getName().equalsIgnoreCase(card)) {
				ec.playCard(1);
				SheepGame.getEventCardDeck().shuffleDeck();
				break;
				 
			}

		}
		super.playCard(status);
	}

	
}
