
public class Car {
	private String color;
	private Transmission transmission;
	private static int numberOfCars;
	private int speed;
	private int gear;
	
	public Car ()
	{
		this("black", Transmission.AUTOMATIC);
	}
	public Car (String color, Transmission t)
	{
		this.color = color;
		transmission = t;
		++Car.numberOfCars;
		this.gear = 1;
	}
	
	public String toString ()
	{
		return this.color+" car going "+this.speed+" mph in "+this.gear;
	}
	
	public static int getNumberOfCars ()
	{
		return Car.numberOfCars;
	}
	
	public void accelerate (int newSpeed)
	{
		this.speed = newSpeed;
		++this.gear;
	}
}
