import java.util.ArrayList;

public class Roll extends ArrayList<Integer>{

	private Occurrences occurrences;

	private int diceSide;

	public final static int ONE=1;
	public final static int TWO=2;
	public final static int THREE=3;
	public final static int FOUR=4;
	public final static int FIVE=5;
	public final static int SIX=6;

	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.add(dice1);
		this.add(dice2);
		this.add(dice3);
		this.add(dice4);
		this.add(dice5);
		this.occurrences = new Occurrences(this);
	}

	public Occurrences getOccurrences() {
		return occurrences;
	}

	private int getNbOfKind(int diceSide) {
		return this.occurrences.get(diceSide);
	}

	public int getGreatestPairValue() {
		this.diceSide = SIX;
		while(diceSide >= ONE && getNbOfKind(diceSide) != Category.PAIR) 
			diceSide --;
		return diceSide; 
	}

	public int getTwinsValue(int nbOfKind) {
		this.diceSide = ONE;
		while(getNbOfKind(diceSide) != nbOfKind && diceSide < 6) 
			diceSide++;
		return diceSide;	
	}

	public boolean containsTwins(int nbOfKind) {
		return getOccurrences().containsValue(nbOfKind);
	}

	public boolean containsTwoTwins() {
		int nbOfTwins = 0;
		for(int nbOfKind : this.occurrences.values()) {
			if(nbOfKind == Category.PAIR || nbOfKind == Category.TRIPLE)
				nbOfTwins ++;
		}
		return nbOfTwins == Category.TWO_PAIRS;
	}

	public boolean containsStraight(int minValue) {
		boolean contains = true;
		this.diceSide = minValue;
		while(diceSide < this.size()) {
			contains &= getNbOfKind(diceSide) == 1;
			diceSide ++;
		}	
		return contains;
	}

	public int sumAllDices() {
		int sum = 0;
		for(int dice : this) 
			sum +=dice;
		return sum;		
	}

	public int sumPairsValue() {
		int sum =0;
		this.diceSide = ONE;
		while(diceSide < SIX) {
			if(this.getNbOfKind(diceSide) == Category.PAIR)
				sum += diceSide*2;
			diceSide ++;
		}	
		return sum;
	}

}
