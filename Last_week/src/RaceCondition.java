public class RaceCondition extends Thread
{
	private Counter counter;

	public RaceCondition (Counter counter)
	{
		this.counter = counter;
	}

	@Override
	public void run ()
	{
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
		}
		this.counter.increment();
	}

	public static void main (String[] args)
	{
		Counter counter = new Counter();

		RaceCondition[] threads = new RaceCondition[1000];

		for (int i = 0; i < threads.length; ++i)
		{
			threads[i] = new RaceCondition(counter);
			threads[i].start();
		}

		for (RaceCondition r: threads)
		{
			try
			{
				r.join();
			}
			catch (InterruptedException e)
			{
			}
		}

		System.out.println("Final value is: "+counter.value());
	}
}