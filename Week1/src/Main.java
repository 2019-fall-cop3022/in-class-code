
public class Main {

	public static void main (String[] args)
	{
		assert 0 > 1;
		System.out.println("Hello World");
		/*
		if (condition)
		{
			if ()
			System.out.println("true");
		}
		else if () {
			
		}
		else
		{
			
		}
		*/
		int a = 0;
		int b = (a > 0) ? 1 : (a >= 0) ? 2 : 0; // noooooo
		
		System.out.println(b);
		
		switch (b)
		{
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			default:
				System.out.println(4);
		}
		
		int j = 3;
		while (j > 0)
		{
			System.out.println(j--);
		}
		
		for (int i = 0; i < 5; ++i)
		{
			System.out.println(i);
		}
		
		do
		{
			if (j <= 0)
			{
				break;
				// System.exit(1);
			}
			System.out.println(j++);
		} while (j > 3);
		
		String array[] = new String[] {"foo", "bar", "baz"};
		for (String s: array)
		{
			System.out.println(s);
		}
		
		if (true || ++a == b)
		{
		}
		
	}
}
