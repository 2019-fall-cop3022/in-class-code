
public class Car {
	private String color;
	private Transmission transmission;
	private static int numberOfCars;
	
	public Car ()
	{
		this("black", Transmission.AUTOMATIC);
	}
	public Car (String color, Transmission t)
	{
		this.color = color;
		transmission = t;
		++Car.numberOfCars;
	}
	
	public String toString ()
	{
		return this.color;
	}
	
	public static int getNumberOfCars ()
	{
		return Car.numberOfCars;
	}
}
