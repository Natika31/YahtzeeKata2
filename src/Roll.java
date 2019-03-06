import java.util.ArrayList;

public class Roll extends ArrayList<Integer>{

	private OccurrenceCounter nbOfKindForAllValues;

	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.add(dice1);
		this.add(dice2);
		this.add(dice3);
		this.add(dice4);
		this.add(dice5);
		this.nbOfKindForAllValues = new OccurrenceCounter(this);
	}
	
	public OccurrenceCounter getNbOfKindForAllValues() {
		return nbOfKindForAllValues;
	}
	
	private Integer getNbOfKindForOneValue(int sideValue) { 
		return this.nbOfKindForAllValues.get(sideValue);
	}

	public int getGreatestPairValue() {
		int index = this.nbOfKindForAllValues.size() - 1 ;
		while(index != 0 && getNbOfKindForOneValue(index) != 2) 
			index --;
		return index + 1; 
	}
	
	public int getTwinsValue(int typeOfTwin) {
		int index = 0;
		while(getNbOfKindForOneValue(index) != typeOfTwin && index < this.nbOfKindForAllValues.size()) 
			index++;
		return index + 1;	
	}

	public boolean containsTwins(int typeOfTwin) {
		return this.nbOfKindForAllValues.contains(typeOfTwin);
	}
	
	public boolean containsTwoTwins() {
		int nbOfTwins = 0;
		for(int nbOfKindForOneSide : this.nbOfKindForAllValues) {
			if(nbOfKindForOneSide == Category.PAIR || nbOfKindForOneSide == Category.TRIPLE)
				nbOfTwins ++;
		}
		return nbOfTwins == 2;
	}
	
	public boolean containsStraight(int minValue) {
		boolean contains = true;
		for(int index = minValue; index < this.size(); index ++) 
			contains &= getNbOfKindForOneValue(index) == 1;		
		return contains;
	}
	
	public int sumAllDices() {
		int sum = 0;
		for(int dice : this) 
			sum +=dice;
		return sum;		
	}
	
	public int sumPairsValue() {
		int pairIndex = 0;
		int index = 1;
		for(int occNb : this.nbOfKindForAllValues) {
			if(occNb == Category.PAIR) 
				pairIndex += index;
			index++;
		}
		return pairIndex*2;
	}





}
