
public class Triple extends Category {


	@Override
	public int compute(Roll roll) {
		return roll.getTwinsValue(TRIPLE)*3;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsTwins(TRIPLE);
	}

}
