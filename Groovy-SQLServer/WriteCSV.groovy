import java.sql.*;
import groovy.sql.Sql;
import java.io.FileWriter;
import java.io.IOException;

class WriteCSV
{
	static void main(args) throws ClassNotFoundException, SQLException, IOException
	{
		final def JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final def JDBC_URL = "jdbc:sqlserver://____serverName____;databaseName=________________";
		final def USERNAME = "_________";
		final def PASSWORD = "_________";
		
		def check = false;

		def sql = Sql.newInstance(JDBC_URL, USERNAME, PASSWORD, JDBC_DRIVER); // requesting a connection
		
		
		def tableRows = []
		sql.eachRow("SELECT * from [dbo].[____tableName____]")
		{
			tp ->tableRows << tp.toString();
			if(!check) // affect only once
				check = true; // if any row is found change status
		}
		if( !check )
			println "No data found.\n"
		else				
		{
			FileWriter fileWriter = new FileWriter("C:\\Users\\Rohit\\Documents\\____tableName____.csv");
			tableRows.forEach { tp ->fileWriter.append( tp.toString()+"\n" )}
			println "CSV file created successfully."
			fileWriter.close();
		}	
	}
}
