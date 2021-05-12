package game;

// used to make the sheep cards
// values are from SheepValues class
public class SheepCard {
	
	
	//holds the card's number of sheep
	private int value;
	
	// not constructed with the exact values but using from a separate class
	// in case changes need to be made
	public SheepCard(int value) {
		switch (value) {
		case SheepValues.VALUE_ONE:
			this.value = value;
			break;
		case SheepValues.VALUE_THREE:
			this.value = value;
			break;
		case SheepValues.VALUE_TEN:
			this.value = value;
			break;
		case SheepValues.VALUE_THIRTY:
			this.value = value;
			break;
		case SheepValues.VALUE_HUNDRED:
			this.value = value;
			break;
		case SheepValues.VALUE_THREE_HUNDRED:
			this.value = value;
			break;
		case SheepValues.VALUE_THOUSAND:
			this.value = value;
			break;
		default:
			this.value = SheepValues.VALUE_ONE;
		}
	}

	// gets the value of the sheep cards
	public int getValue() {
		return value;
	}
	

}
