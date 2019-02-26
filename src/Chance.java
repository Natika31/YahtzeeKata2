
public class Chance extends Category {
	
	public int compute(Roll roll) {
		return roll.sumAll();
	}
}
