
public class Frog extends Critter
{
	private int wartCount;
	
	public Frog ()
	{
		this("green");
	}
	
	public Frog (String color)
	{
		super(color);
		this.wartCount = 12;
	}
	
	public String move ()
	{
		return super.move()+"hopping";
	}
}
