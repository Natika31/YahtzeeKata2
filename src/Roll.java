
public class Roll {
	
	private int [] dices; 
	
	public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		this.dices =new int []{dice1, dice2, dice3,dice4,dice5};
	}

	public int sumAll() {
		int sum = 0;
		for(int dice : dices) 
			sum +=dice;
		return sum;		
	}

}
