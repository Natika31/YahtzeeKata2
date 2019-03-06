
public class Twos extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(2)*2;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getNbOfKindForAllValues().countOccurrence(2) != 0;
	}

}
