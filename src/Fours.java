
public class Fours extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.FOUR)*4;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.FOUR) >= 1;
	}

}
