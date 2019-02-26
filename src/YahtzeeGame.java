
public class YahtzeeGame {

	private Roll roll;
	
	private Category category;
	
	public int score() {
		if(this.category.isCompatible(roll))
			return this.category.compute(roll);
		return 0;
	}

	public Roll getRoll() {
		return roll;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	


	
	
}
