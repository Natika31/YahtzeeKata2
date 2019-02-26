
public abstract class Category {
	
	protected boolean isCompatible = true;

	public abstract int compute(Roll roll) ;
	
	public abstract boolean isCompatible(Roll roll);

}
