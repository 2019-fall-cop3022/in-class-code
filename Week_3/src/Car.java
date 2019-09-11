
public class Car {
	private String color;
	private Transmission transmission;
	
	public Car ()
	{
		this("black", Transmission.AUTOMATIC);
	}
	public Car (String color, Transmission t)
	{
		this.color = color;
		transmission = t;
	}
	
	public String toString ()
	{
		return this.color;
	}
}
