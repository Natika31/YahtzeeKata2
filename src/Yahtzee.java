
public class Yahtzee extends Category {


	@Override
	public int compute(Roll roll) {
		return 50;
	}
	
	public boolean isCompatible(Roll roll) {
		return roll.containsTwins(YAHTZEE);
	}	

}
