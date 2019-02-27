public class FullHouse extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getTwinsValue(PAIR)*2+roll.getTwinsValue(TRIPLE)*3;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsTwoTwins() && roll.containsTwins(TRIPLE);
	}

}
