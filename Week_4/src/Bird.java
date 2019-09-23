
public class Bird extends Critter {
	public static final int FOO = 12;
	
	public Bird ()
	{
		this("yellow");
	}
	
	public Bird (String color)
	{
		super(color);
	}
	
	@Override
	public String move ()
	{
		return super.getColor()+" and flapping";
	}
}
