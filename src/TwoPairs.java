
public class TwoPairs extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.sumPairsValue();
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsTwoTwins() && !roll.containsTwins(TRIPLE) ;
	}

}
