import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		try
		{
			Main.getPositiveInt(keyboard);
		}
		catch (Exception e)
		{
			
		}
	}
	
	public static int getPositiveInt (Scanner keyboard) throws NegativeNumberException
	{
		System.out.print("Enter a positive integer: ");
		
		int input;
		input = keyboard.nextInt();
		
		if (true)
		{
			throw new NegativeNumberException();
		}
		
		return 0;
	}
}
