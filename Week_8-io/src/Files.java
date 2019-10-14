import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int foo = input.nextInt();
		
		try
		{
			FileInputStream infs = new FileInputStream("foo.txt");
			Scanner in = new Scanner(infs);
			int bar = in.nextInt();
			System.out.println("From file: "+bar);
			bar = in.nextInt();
			System.out.println("From file: "+bar);
			
			FileOutputStream outfs = new FileOutputStream("foo.out");
			PrintWriter out = new PrintWriter(outfs);
			out.println("From file: "+bar);
			out.flush(); // if missing, output file will be empty
		}
		catch (Exception e)
		{
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			
		}
	}
}
