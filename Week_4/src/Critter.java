
public class Critter {
	private String color;
	
	public Critter ()
	{
		this("yellow");
	}
	
	public Critter (String color)
	{
		this.color = color;
	}
	
	public String move ()
	{
		return this.color+" and ";
	}
}
