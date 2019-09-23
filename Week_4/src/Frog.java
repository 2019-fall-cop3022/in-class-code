
public class Frog extends Critter
{
	private int wartCount;
	
	public Frog ()
	{
		this("green", 12);
	}
	
	public Frog (String color, int wartCount)
	{
		super(color);
		this.wartCount = wartCount;
	}
	
	public int getWartCount ()
	{
		return this.wartCount;
	}
	
	public String move ()
	{
		return super.getColor()+" and hopping";
	}
}
