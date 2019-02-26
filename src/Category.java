
public abstract class Category {
	public static final int PAIR = 2;

	protected boolean isCompatible = true;

	public abstract int compute(Roll roll) ;
	
	public abstract boolean isCompatible(Roll roll);

}
