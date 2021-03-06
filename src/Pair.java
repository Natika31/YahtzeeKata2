
public class Pair extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getGreatestPairValue()*2;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsTwins(PAIR);
	}


}
