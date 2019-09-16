
public class ArrayStuff {
	public static void main (String[] args)
	{
		int f[] = new int[5];
		
		for (int temp: f)
		{
			temp = 4;
		}
		for (int temp: f)
		{
			System.out.println(temp);
		}
		for (int i = 0; i < 5; ++i)
		{
			f[i] = 4;
		}
		for (int temp: f)
		{
			System.out.println(temp);
		}
		
		DaysOfTheWeek mon = DaysOfTheWeek.MONDAY;
		
		switch (mon)
		{
			case MONDAY:
				System.out.println("Oh no");
		
		}
		
		if (args.length > 0)
		{
			System.out.println(args[0]);
		}
		
		int[] scores;
		scores = new int[10];
		
		System.out.println(scores[3]);
		
		int[] foos = {2, 3, 4};
		System.out.println(foos.length);
		
		char[] letters = {'a', 'b', 'c'};
		System.out.println(letters);
		
		String[] words = new String[5];
		if (words[0] != null)
		{
			if (words[0].equals("")) // NullPointerException
			{
				System.out.println("yay!");
			}
		}
		int a = 3;
		int b = 3;
		if (a == b)
		{
			System.out.println("a == b");
		}
		
		int[] c = {1, 2, 3};
		int[] d = {1, 2, 3};
		
		if (c == d)
		{
			System.out.println("c == d");
		}
		ArrayStuff.doArrayThing(c);
		System.out.println("Array now has " + c[0]);
	
		int[] response = ArrayStuff.gimmeAnArray();
		
		int[][][][][] s = new int[10][11][12][3][4];
		System.out.println(s[0][1].length);
	}
	
	public static void doArrayThing(int[] foo)
	{
		System.out.println("Doing array thing " + foo[0]);
		foo[0] = 12;
	}
	
	public static int[] gimmeAnArray ()
	{
		int[] response ={1,2,3};
		return response;
	}
}
