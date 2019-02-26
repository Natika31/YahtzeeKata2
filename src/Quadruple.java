
public class Quadruple extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.getTwinsValue(QUADRUPLE)*4;
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsTwins(QUADRUPLE);
	}

}
