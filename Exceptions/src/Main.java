import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				Main.getPositiveInt(keyboard);
				break;
			}
			catch (NegativeNumberException e)
			{
				System.out.println(e.getMessage());
			}
			catch (Exception e)
			{
				System.out.println("ahhh");
			}
			finally
			{
				System.out.println("always runs");
				keyboard.close();
			}
		}
	}
	
	public static int getPositiveInt (Scanner keyboard) throws NegativeNumberException
	{
		System.out.print("Enter a positive integer: ");
		
		int input;
		input = keyboard.nextInt();
		
		Main.testIsPositive(input);
		
		return 0;
	}
	
	public static void testIsPositive (int input) throws NegativeNumberException
	{
		if (input < 0)
		{
			throw new NegativeNumberException(input + " is a negative number");
		}
	}
}
