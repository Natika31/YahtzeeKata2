import java.util.ArrayList;

public class Roll extends ArrayList<Integer>{
		
	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.add(dice1);
		this.add(dice2);
		this.add(dice3);
		this.add(dice4);
		this.add(dice5);
	}

	public int sumAll() {
		int sum = 0;
		for(int dice : this) 
			sum +=dice;
		return sum;		
	}
	
	public int countOccurrence(int searchedValue) {
		int occNb = 0;
		for(int dice : this) {
			if(dice == searchedValue)
				occNb++;
		}
		return occNb;
	}

}
