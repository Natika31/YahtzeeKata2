
public class Ones extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.ONE);
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.ONE) >= 1;
	}

}
