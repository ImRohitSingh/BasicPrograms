import java.sql.*;
import groovy.sql.Sql;
import java.io.FileWriter;
import java.io.IOException;

class WriteCSV
{
	static void main(args) throws ClassNotFoundException, SQLException, IOException
	{
		final def JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final def JDBC_URL = "jdbc:sqlserver://IPKOLTOOLSSRV1;databaseName=SMSPHtndSFHI";
		final def USERNAME = "a2aUser";
		final def PASSWORD = "a2apassW";
		
		def choice, check = false, slNo, topic, status, date, query;

		def sql = Sql.newInstance(JDBC_URL, USERNAME, PASSWORD, JDBC_DRIVER); // requesting a connection
		
		
		def tableRows = []
		sql.eachRow("SELECT * from [dbo].[RevReclasfRqstQueue]")
		{
			tp ->tableRows << tp.toString();
			if(!check) // affect only once
				check = true; // if any row is found change status
		}
		if( !check )
			println "No data found.\n"
		else				
		{
			FileWriter fileWriter = new FileWriter("C:\\Users\\RS067558\\Documents\\RevReclasfRqstQueue.csv");
			tableRows.forEach { tp ->fileWriter.append( tp.toString()+"\n" )}
			println "CSV file created successfully."
			fileWriter.close();
		}	
	}
}
