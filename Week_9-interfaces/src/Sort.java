
public class Sort {
	public static void sortMe (Comparable[] a)
	{
		for (int i = 0; i < a.length - 1; ++i)
		{
			for (int j = i + 1; j < a.length; ++j)
			{
				if (a[i].compareTo(a[j]) > 0)
				{
					swap(a, i, j);
				}
			}
		}
	}
	
	public static void swap (Comparable[] a, int i, int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
