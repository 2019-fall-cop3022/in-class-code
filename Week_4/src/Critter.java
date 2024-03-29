
public abstract class Critter {
	private String color;
	
	public Critter ()
	{
		this("yellow");
	}
	
	public Critter (String color)
	{
		this.color = color;
	}
	
	public final String getColor ()
	{
		return this.color;
	}
	
	public abstract String move ();
}
