public class Counter
{
	private int counter;

	public Counter ()
	{
		this.counter = 0;
	}

	public int value ()
	{
		return this.counter;
	}


	public /* synchronized */ void increment ()
	{
		++this.counter;
	}
}