import java.util.HashMap;

public class Occurrences extends HashMap<Integer,Integer>{

	private Roll roll;

	public Occurrences(Roll roll) {
		this.roll = roll;
		for(int value = 1; value <=6; value++)  
			this.put(value, countOccurrence(value));
	}
	
	public int countOccurrence(int searchedValue) {
		int occNb = 0;
		for(int dice : roll) {
			if(dice == searchedValue)
				occNb++;
		}
		return occNb;
	}	
	
}
