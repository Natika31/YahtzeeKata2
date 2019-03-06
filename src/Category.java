public abstract class Category {
	public static final int PAIR = 2;
	public static final int TWO_PAIRS = 2;
	public static final int TRIPLE = 3;
	public static final int QUADRUPLE = 4;
	public static final int YAHTZEE = 5;

	public abstract int compute(Roll roll) ;
	
	public abstract boolean isCompatible(Roll roll);

}
