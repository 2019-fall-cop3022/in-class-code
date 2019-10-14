
public class Printf {
	public static void main (String[] args)
	{
		int precision = 2;
		String foo ="Foo";
		int d = 12;
		double bar = 1.23456789;
		String output = String.format("Hello %s my info is %08d score %."+precision+"f", foo, d, bar);
		System.out.println(output);
	}
}
