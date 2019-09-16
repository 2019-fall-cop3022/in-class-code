
public class Frog {
	private String color;
	private int wartCount;
	
	public Frog ()
	{
		this("green");
	}
	
	public Frog (String color)
	{
		this.color = color;
		this.wartCount = 12;
	}
	
	public String move ()
	{
		return this.color+" and hopping";
	}
}
