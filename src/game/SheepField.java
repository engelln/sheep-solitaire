package game;

// class for holding the sheep cards on the field
public class SheepField {

	// the field is an array that holds 7 sheep cards max
	private SheepCard[] theField = new SheepCard[7];
	
	// starts the field off with 1 sheep card
	public SheepField() {
		theField[0] = new SheepCard(SheepValues.VALUE_ONE);
	}
	
	// adds a card with the given value to the field
	public void addCard(int value) {
		for(int i = 0; i < theField.length; i++) {
			if(theField[i] == null) {
				theField[i] = new SheepCard(value);
				break;
			}
		}
	}
	
	// removes all cards from the field
	public void emptyfield() {
		for(int i = 0; i < theField.length; i++) {
			theField[i] = null;
		}
	}
	
	// removes a sheep with the given value from the field
	public void removeSheep(int value) {
		for(int i = 0; i < theField.length; i++) {
			if(theField[i] != null) {
				if(theField[i].getValue() == value) {
					theField[i] = null;
					break;
				}
			}
		}
	}
	


	// gets the total number of sheep by adding up the value of all cards in the field
	public int getNumberOfSheep() {
		int totalSheep = 0;
		for(SheepCard sheepCard : theField) {
			if(sheepCard != null) {
				totalSheep += sheepCard.getValue();
			}
		}
		return totalSheep;
	}
	
	// gets access to the field array
	public SheepCard[] getField(){
		return theField;
	}
	
	// finds the location of a card with the given value
	public int findIndexOf(int value) {
		int index = 0;
		
		for(int i = 0; i < theField.length; i++) {
			if(theField[i] != null) {
				if(theField[i].getValue() == value) {
					index = i;
				}
			}
		}
		return index;
	}
	
	// gives you the highest value sheep card on the field
	public int findHighestValue() {
		int highestValue = 1;

		for(int i = 0; i < theField.length; i++) {
			if(theField[i] != null) {
				if(theField[i].getValue() > highestValue) {
					highestValue = theField[i].getValue();
					
				}
			}
		}
		
		return highestValue;
		
	}
	
	// gives you the location of the highest value card on the field
	public int findHighestValueIndex() {
		int highestValue = findHighestValue();
		int highestValueIndex = 0;

		for(int i = 0; i < theField.length; i++) {
			if(theField[i] != null) {
				if(theField[i].getValue() == highestValue) {
					highestValueIndex = i;
				}
			}
		}
		
		return highestValueIndex;
		
	}
	
	// gives you the lowest value sheep card on the field
	public int findLowestValue() {
		int lowestValue = 1;

		for(SheepCard card : theField) {
			if(card != null) {
				if(card.getValue() < lowestValue) {
					lowestValue = card.getValue();
					
				}
			}
		}
		
		return lowestValue;
		
	}
	
	// gives you the location of the lowest value card on the field
	public int findLowestValueIndex() {
		int lowestValue = findLowestValue();
		int lowestValueIndex = 0;

		for(int i = 0; i < theField.length; i++) {
			if(theField[i] != null) {
				if(theField[i].getValue() == lowestValue) {
					lowestValueIndex = i;
				}
			}
		}
		
		return lowestValueIndex;
		
	}
	
	// levels up a card by one level
	public void levelUpSheep(int index) {
		int value = theField[index].getValue();
		int valueIndex = 0;
		for(int i = 0; i < SheepValues.getValues().length; i++) {
			if(SheepValues.getValues()[i] == value) {
				valueIndex = i;
			}
		}
		
		theField[index] = new SheepCard(SheepValues.getValues()[valueIndex + 1]);
	}
	
	// gets the number of cards of a given value on the field
	public int getCount(int value) {
		int count = 0;
		for(SheepCard card : theField) {
			if(card != null) {
				if(card.getValue() == value) {
					count++;
				}
			}
		}
		return count;
	}
	
	// gets number of cards on the field
	public int getNumberOfCards() {
		int numberOfCards = 0;
		for(SheepCard card : theField) {
			if(card != null) {
				numberOfCards++;
			}
		}
		return numberOfCards;
	}
}
