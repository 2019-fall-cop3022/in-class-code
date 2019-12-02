# JDBC

## MySQL
* Need to be running the DBMS somewhere.
* Running locally, verify port `SHOW GLOBAL VARIABLES LIKE 'PORT';`, it should be 3306.


* Download Driver https://dev.mysql.com/downloads/connector/j/
	* Or, Google search "java mysql download".
* Compare against md5 checksum to ensure that the zip you downloaded is the same file that is hosted on the site.
* Unzip
	* Eclipse will act like you can use a zip or a JAR, but only JAR will actually work.
* Open Eclipse project and go to _Build path_ => _Libraries_ and click **Add external JARs**.
	* Find the JAR (after verifying it's good with `md5 DOWNLOADED.zip` and unzipping) and save/close out of the build path window.

### Prepared statements
![Comic strip joke about SQL injectioin attacks](https://imgs.xkcd.com/comics/exploits_of_a_mom.png)

To protect against SQL injection attacks, you should always use prepared SQL statements.
In [src/DBMain.java](src/DBMain.java), you can replace the `Statement` and query parts with the code below to run a parameterized query.
```java
PreparedStatement stmt = dbh.prepareStatement("select * from rapper WHERE id>?");
stmt.setInt(1, 0); // placeholder_id, value
ResultSet rapper = stmt.executeQuery();
```
