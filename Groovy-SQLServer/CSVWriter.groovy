import java.sql.*;
import groovy.sql.Sql;
import com.opencsv.CSVWriter; /* download this jar from http://central.maven.org/maven2/com/opencsv/opencsv/3.7/opencsv-3.7.jar */
import java.io.FileWriter;
import java.io.IOException;

class CSVWriter
{
	static void main(args) throws ClassNotFoundException, SQLException, IOException
	{
		final def JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final def JDBC_URL = "jdbc:sqlserver://___serverName______;databaseName=____________________";
		final def USERNAME = "______________";
		final def PASSWORD = "_______________";
		
		def check = false; // parameter to check if table is empty or not; 'false' signifies empty state

		def sql = Sql.newInstance(JDBC_URL, USERNAME, PASSWORD, JDBC_DRIVER); // requesting a connection
		
		def tableRows = []
		sql.eachRow("SELECT * from [dbo].[___tableName______]")
		{
			tp ->tableRows << tp.toString();  // put each row to tableRows
			if(!check) // check to affect initialization only once
				check = true; // if any row is found change status
		}
		
		if( !check )
			println "No data found.\n"
		else				
		{
			CSVWriter csvWriter = new CSVWriter(new FileWriter("C:\\Users\\Rohit\\Documents\\___tableName______.csv"));
			tableRows.forEach { tp ->csvWriter.writeNext( tp.toString() )} // for each row write to .csv file
			println "CSV file created successfully."
			csvWriter.close(); // close the writer
		}	
	}
}
