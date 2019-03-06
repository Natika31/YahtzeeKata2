
public class Fives extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.FIVE)*5;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.FIVE) >= 1;
	}

}
