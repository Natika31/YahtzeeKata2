
public class Ones extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.countOccurrence(1);
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.countOccurrence(1) != 0;
	}

}
