public class Zipper implements Openable, DaysOfTheWeek
{
	public void open ()
	{
		System.out.println("Opening the zipper on "+MONDAY);
	}
	
	public static void main (String[] args)
	{
		Zipper z = new Zipper();
		z.open();
	}
}
