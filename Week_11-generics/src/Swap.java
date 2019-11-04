
public class Swap {
	public static <MyType> void Swap (MyType[] numbers, int i, int j)
	{
		MyType temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
