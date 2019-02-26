
public class Fours extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.countOccurrence(4)*4;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.countOccurrence(4) != 0;
	}

}
