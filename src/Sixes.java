
public class Sixes extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.countOccurrence(6)*6;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.countOccurrence(6) != 0;
	}

}
