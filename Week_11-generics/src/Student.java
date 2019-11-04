
public class Student <T>
{
	private String name;
	private T grade;
	
	public Student (String name, T grade)
	{
		this.name = name;
		this.grade = grade;
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	public T getGrade ()
	{
		return this.grade;
	}
}
