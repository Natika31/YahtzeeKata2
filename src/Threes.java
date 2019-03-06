
public class Threes extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.THREE)*3;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.getOccurrences().countOccurrence(Roll.THREE) >=1 ;
	}

}
