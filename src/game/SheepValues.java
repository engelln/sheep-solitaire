package game;
// class to hold values of sheep cards, as well as some related methods
public class SheepValues {

	public static final int VALUE_ONE = 1;
	public static final int VALUE_THREE = 3;
	public static final int VALUE_TEN = 10;
	public static final int VALUE_THIRTY = 30;
	public static final int VALUE_HUNDRED = 100;
	public static final int VALUE_THREE_HUNDRED = 300;
	public static final int VALUE_THOUSAND = 1000;
	
	private static int[] values = {VALUE_ONE, VALUE_THREE, VALUE_TEN, VALUE_THIRTY, VALUE_HUNDRED, VALUE_THREE_HUNDRED, VALUE_THOUSAND};
	
	public static int[] getValues() {
		return values;
	}
	
	public static int getValueIndex(int value) {
		int valueIndex = 0;
		for(int i = 0; i < SheepValues.getValues().length; i++) {
			if(SheepValues.getValues()[i] == value) {
				valueIndex = i;
			}
		}
		return valueIndex;
	}
	
}
