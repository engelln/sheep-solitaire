package game;

// only using a .* because we need almost every class in the eventcards package
import eventcards.*;


// class to hold the cards in the deck, easier to make changes this way
public class CardArray {

	private static EventCard[] eventCards = {
			new BeFruitful(),
			new BeFruitful(),
			new BeFruitful(),
			
			new Dominion(),
			new Dominion(),
			
			new AllPurposeSheep(),
			new Crowding(),
			new FallingRock(),
			new FillTheEarth(),
			new Flourish(),
			new GoldenHooves(),
			new Inspiration(),
			new Lightning(),
			new Meteor(),
			new Multiply(),
			new Plague(),
			new PlanningSheep(),
			new SheepDog(),
			new Shephion(),
			new Slump(),
			new Storm(),
			new Wolves()

	};
	
	// getter so that the EventCardDeck object can fill its ArrayList with the cards defined here
	public static EventCard[] getEventCards() {
		return eventCards;
	}

}
