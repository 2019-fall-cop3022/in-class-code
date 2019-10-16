import java.io.Serializable;

class Submarine implements Serializable
{
	private String name;
	private int length;
	private int crewSize;

	final private static long serialVersionUID = 123456789;

	Submarine (String name, int length, int crewSize)
	{
		this.name = name;
		this.length = length;
		this.crewSize = crewSize;
	}

	public String toString ()
	{
		return "\nThe only good Marines are Submarines!\n"+
			"The USS "+this.name+
			" is "+this.length+" feet long"+
			" and carries a "+this.crewSize+" person crew.";
	}
}
