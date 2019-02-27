
public class LargeStraight extends Category {

	@Override
	public int compute(Roll roll) {
		return roll.sumAll();
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return roll.containsStraight(1);
	}

}
