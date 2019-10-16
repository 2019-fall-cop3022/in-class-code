import java.io.*;
import java.util.Scanner;

class Serializer
{
	final static String filename = "submarine.obj";

	public static void main (String[] args)
	{
		System.out.print("Read or write (r/w)? ");
		Scanner keyboard = new Scanner(System.in);
		char readOrWrite = keyboard.next().charAt(0);
		keyboard.nextLine(); // eat end of line character

		switch (readOrWrite)
		{
			case 'r':
				Serializer.readFromFile();
				break;
			case 'w':
				Serializer.create(keyboard);
				break;
			default:
				System.out.println("Oh c'mon, how hard is it to type one of the two options");
				System.exit(1);
		}

		keyboard.close();
	}

	public static void readFromFile ()
	{
		// open file
		try (FileInputStream inFile = new FileInputStream(Serializer.filename))
		{
			ObjectInputStream objectStream = new ObjectInputStream(inFile);

			// read and cast to Submarine, otherwise it will be a Java "Object"
			Submarine ssn = (Submarine) objectStream.readObject();
			System.out.println(ssn.toString());
		}
		catch (Exception e)
		{
			System.out.println(e.getClass()+": "+e.getMessage());
		}
	}

	public static void create (Scanner keyboard)
	{
		System.out.print("Enter name of sub: ");
		String name = keyboard.nextLine();
		System.out.print("Enter length of sub: ");
		int length = keyboard.nextInt();
		System.out.print("Enter number of crew: ");
		int crewSize = keyboard.nextInt();

		Submarine ssn = new Submarine(name, length, crewSize);
		System.out.println(ssn.toString());

		Serializer.writeToFile(ssn);
	}

	public static void writeToFile (Submarine ssn)
	{
		try (FileOutputStream outFile = new FileOutputStream(Serializer.filename))
		{
			ObjectOutputStream objectStream = new ObjectOutputStream(outFile);

			// This is what actually triggers the serialization
			for (int i = 0; i < 1; ++i)
			objectStream.writeObject(ssn);
		}
		catch (Exception e)
		{
			System.out.println(e.getClass()+": "+e.getMessage());
		}
	}
}
