public abstract class Category {
	public static final int PAIR = 2;
	public static final int TRIPLE = 3;
	public static final int QUADRUPLE = 4;


	protected boolean isCompatible = true;

	public abstract int compute(Roll roll) ;
	
	public abstract boolean isCompatible(Roll roll);

}
