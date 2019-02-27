import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Roll extends ArrayList<Integer>{

	private ArrayList<Integer> nbOfOccForEachValueArray;

	private int[] values = {1,2,3,4,5,6};


	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.add(dice1);
		this.add(dice2);
		this.add(dice3);
		this.add(dice4);
		this.add(dice5);
		this.countOccurrences();
	}

	private List<Integer> countOccurrences() {
		this.nbOfOccForEachValueArray = new ArrayList<>();
		for(int value : values)  
			this.nbOfOccForEachValueArray.add(countOccurrence(value));
		return this.nbOfOccForEachValueArray;
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

	public boolean containsTwins(int nbOfTwin) {
		return this.nbOfOccForEachValueArray.contains(nbOfTwin);
	}

	public boolean containsTwoPairs() {
		int nbOfPair = 0;
		for(int occNb : this.nbOfOccForEachValueArray) {
			if(occNb == 2)
				nbOfPair++;
		}
		return (nbOfPair == 2);
	}
	
	public boolean containsStraight(int minValue) {
		int value = minValue;
		int nbOfDice = 5;
		while(this.nbOfOccForEachValueArray.get(value) == 1) {
			nbOfDice --;
			value ++;
		}
		return (value == 5);
	}

	public int getTwinsValue(int nbOfTwin) {
		int index = 0;
		while(this.nbOfOccForEachValueArray.get(index) != nbOfTwin && index < this.nbOfOccForEachValueArray.size()) {
			index++;
		}
		return index + 1;	
	}

	public int sumPairsValue() {
		int pairIndex = 0;
		int index = 1;
		for(int occNb : this.nbOfOccForEachValueArray) {
			if(occNb == 2) 
				pairIndex += index;
			index++;
		}
		return pairIndex*2;
	}


	public int greatestPairValue() {
		int index = this.nbOfOccForEachValueArray.size() - 1 ;
		while(index != 0 && this.nbOfOccForEachValueArray.get(index) != 2) 
			index --;
		return index + 1; 
	}



}
