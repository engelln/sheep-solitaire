package game;

// importing .* because we need all the event cards
import eventcards.*;

// class for creating on-the-go event cards, specifically for the all purpose sheep card
public class CardFactory {
	
	public EventCard createCard(String name) {
		EventCard createdCard = null;
		
		if(name.equalsIgnoreCase("All Purpose Sheep")) {
			createdCard = new AllPurposeSheep();
		}
		
		else if(name.equalsIgnoreCase("Crowding")) {
			createdCard = new Crowding();
		}

		else if(name.equalsIgnoreCase("Dominion")) {
			createdCard = new Dominion();
		}

		else if(name.equalsIgnoreCase("Falling Rock")) {
			createdCard = new FallingRock();
		}

		else if(name.equalsIgnoreCase("Fill The Earth")) {
			createdCard = new FillTheEarth();
		}

		else if(name.equalsIgnoreCase("Flourish")) {
			createdCard = new Flourish();
		}

		else if(name.equalsIgnoreCase("Golden Hooves")) {
			createdCard = new GoldenHooves();
		}

		else if(name.equalsIgnoreCase("Inspiration")) {
			createdCard = new Inspiration();
		}

		else if(name.equalsIgnoreCase("Lightning")) {
			createdCard = new Lightning();
		}

		else if(name.equalsIgnoreCase("Meteor")) {
			createdCard = new Meteor();
		}

		else if(name.equalsIgnoreCase("Multiply")) {
			createdCard = new Multiply();
		}

		else if(name.equalsIgnoreCase("Plague")) {
			createdCard = new Plague();
		}

		else if(name.equalsIgnoreCase("Planning Sheep")) {
			createdCard = new PlanningSheep();
		}

		else if(name.equalsIgnoreCase("Sheep Dog")) {
			createdCard = new SheepDog();
		}

		else if(name.equalsIgnoreCase("Shephion")) {
			createdCard = new Shephion();
		}

		else if(name.equalsIgnoreCase("Slump")) {
			createdCard = new Slump();
		}

		else if(name.equalsIgnoreCase("Storm")) {
			createdCard = new Storm();
		}

		else if(name.equalsIgnoreCase("Wolves")) {
			createdCard = new Wolves();
		}
		
		return createdCard;
	}
	

}
