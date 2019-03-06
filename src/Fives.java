
public class Fives extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(5)*5;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(5) != 0;
	}

}
