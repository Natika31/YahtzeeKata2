
public class Chance extends Category {
	
	public int compute(Roll roll) {
		return roll.sumAllDices();
	}

	@Override
	public boolean isCompatible(Roll roll) {
		return true;
	}
}
