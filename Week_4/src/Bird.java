
public class Bird {
	private String color;
	
	public Bird ()
	{
		this("yellow");
	}
	
	public Bird (String color)
	{
		this.color = color;
	}
	
	public String move ()
	{
		return this.color+" and flapping";
	}
}
