import java.sql.*;
import groovy.sql.Sql;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

class CSVWriter
{
	static void main(args) throws ClassNotFoundException, SQLException, IOException
	{
		final def JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final def JDBC_URL = "jdbc:sqlserver://IPKOLTOOLSSRV1;databaseName=SMSPHtndSFHI";
		final def USERNAME = "a2aUser";
		final def PASSWORD = "a2apassW";
		
		def check = false;

		def sql = Sql.newInstance(JDBC_URL, USERNAME, PASSWORD, JDBC_DRIVER); // requesting a connection
		
		def tableRows = []
		sql.eachRow("SELECT * from [SMSPHtndSFHI].[CTMSIB01_DEVSRF597_01_SFET_1237].[SIB000]")
		{
			tp ->tableRows << tp.toString();
			if(!check) // affect initialization only once
				check = true; // if any row is found change status
		}
		
		if( !check )
			println "No data found.\n"
		else				
		{
			CSVWriter csvWriter = new CSVWriter(new FileWriter("C:\\Users\\RS067558\\Documents\\CTMSIB01_DEVSRF597_01_SFET_1237.csv"));
			tableRows.forEach { tp ->csvWriter.writeNext( tp.toString() )}
			println "CSV file created successfully."
			csvWriter.close();
		}	
	}
}
