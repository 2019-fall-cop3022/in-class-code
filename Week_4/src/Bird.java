
public class Bird extends Critter {
	
	public Bird ()
	{
		this("yellow");
	}
	
	public Bird (String color)
	{
		super(color);
	}
	
	public String move ()
	{
		return super.move()+"flapping";
	}
}
