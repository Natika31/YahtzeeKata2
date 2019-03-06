import java.util.ArrayList;

public class OccurrenceCounter extends ArrayList<Integer>{

	private Roll roll;

	public OccurrenceCounter(Roll roll) {
		this.roll = roll;
		for(int value = 1; value <=6; value++)  
			this.add(countOccurrence(value));
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
