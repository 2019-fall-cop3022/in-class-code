import java.sql.*;

public class DBMain
{
	public static void main (String[] args)
	{
		String databaseName = "bar";
		String userName = "root";
		String password = "";

		try (Connection dbh = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseName, userName, password))
		{
			Statement stmt = dbh.createStatement();
			ResultSet rapper = stmt.executeQuery("SELECT * FROM rapper");

			while (rapper.next())
			{
				int id = rapper.getInt(1);
				String name = rapper.getString(2);
				String quality = rapper.getString(3);
				boolean dead = rapper.getBoolean(4);
				System.out.printf("%d: %s is %s, Deceased? %b\n", id, name, quality, dead);
			}
		}
		catch (Exception e)
		{
			System.out.println("Unable to connect to database");
		}
	}

}
