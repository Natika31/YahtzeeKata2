import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Roll extends ArrayList<Integer>{
	
	private ArrayList<Integer> occurrencesArray;

	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.add(dice1);
		this.add(dice2);
		this.add(dice3);
		this.add(dice4);
		this.add(dice5);
		this.countOccurrence();
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

	private List<Integer> countOccurrence() {
		this.occurrencesArray = new ArrayList<>();
		int[] sideValues = {1,2,3,4,5,6};
		for(int sideValue : sideValues)  
			this.occurrencesArray.add(countOccurrence(sideValue));
		return this.occurrencesArray;
	}

	public boolean containsTwins(int nbOfTwin) {
		return this.occurrencesArray.contains(nbOfTwin);
	}
	
	public boolean containsTwoPairs() {
		int nbOfPair = 0;
		for(int occNb : this.occurrencesArray) {
			if(occNb == 2)
				nbOfPair++;
		}
		return (nbOfPair == 2);
	}
	
	public int getTwinsValue(int nbOfTwin) {
		int index = 0;
		while(this.occurrencesArray.get(index) != nbOfTwin && index < this.occurrencesArray.size()) {
			index++;
		}
		return index + 1;	
	}
	
	public int sumPairsValue() {
		int pairIndex = 0;
		int index = 1;
		for(int occNb : this.occurrencesArray) {
			if(occNb == 2) 
				pairIndex += index;
			index++;
		}
		return pairIndex*2;
}
	

	public int greatestPairValue() {
		int index = this.occurrencesArray.size() - 1 ;
		while(index != 0 && this.occurrencesArray.get(index) != 2) 
			index --;
		return index + 1; 
	}



}
