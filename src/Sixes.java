
public class Sixes extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.SIX)*6;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.SIX) >= 1;
	}

}
