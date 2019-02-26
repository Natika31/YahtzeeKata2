
public class Yahtzee extends Category {


	@Override
	public int compute(Roll roll) {
		return 50;
	}
	
	public boolean isCompatible(Roll roll) {
		int i = 0;
		while(isCompatible && i < roll.size()-1) {
			super.isCompatible = roll.get(i) == roll.get(i+1);
			i++;
		}
		return isCompatible;
	}	

}
