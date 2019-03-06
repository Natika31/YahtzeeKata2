
public class Threes extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(3)*3;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(3) != 0;
	}

}
