
public class Max
{
	public static <MyType extends Comparable<MyType>> MyType getMax (MyType[] numbers)
	{
		MyType maxSoFar = numbers[0];
		
		for (int i = 1; i < numbers.length; ++i)
		{
			if (numbers[i].compareTo(maxSoFar) > 0)
			{
				maxSoFar = numbers[i];
			}
		}
		
		return maxSoFar;
	}

}
