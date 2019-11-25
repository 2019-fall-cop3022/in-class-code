
public class RecursionVIteration {
	public static void main (String[] args)
	{
		//for (int i = 0; i >= 0; )
		//{
			//
		//}
		RecursionVIteration.foo(10);
	}
	
	public static void foo (int n)
	{
		if (n < 0)
		{
			return;
		}
		foo(n-1);
	}
}
