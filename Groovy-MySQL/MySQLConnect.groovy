import java.sql.*;
import java.util.Calendar.*;
import groovy.sql.Sql;


class MySQLConnect 
{
	static void main(args) throws ClassNotFoundException, SQLException, NumberFormatException
	{
		final def JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final def JDBC_URL = "jdbc:mysql://localhost:3306/";
		final def DB_NAME = "_______";  // name of your database
		final def USERNAME = "_____"; // your username
		final def PASSWORD = "";
		def choice, check = false, slNo, topic, status, date, query;

		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		def sql = Sql.newInstance(JDBC_URL+DB_NAME,USERNAME,PASSWORD, JDBC_DRIVER); // requesting a connection
		
		while(true)
		{
			println "\n\n---MENU---\n1.Check DB Version\n2.Display\n3.Insert\n4.Delete\n5.Exit\nEnter choice:"
			choice = System.in.newReader().readLine() as Integer;
			switch(choice)
			{
				case 1: sql.eachRow('SELECT VERSION()')
						{ 
							row->println row[0]
						}
						break;
				case 2: println "\n"
						// printing in format [Serial Number, Topic, Time Stamp, Status ]
						sql.eachRow("SELECT * from NOTIFICATIONS") 
						{
							tp ->println([tp.timestamp , tp.topic , tp.status])
							check = true; // if any row is found change status
						}
						if( !check )
							println "No data found.\n"
						break;
				case 3: 
						println "\nEnter topic: "
						topic = System.in.newReader().readLine()
						
						println "\nEnter status: "
						status = System.in.newReader().readLine()
						
						date = new Date(System.currentTimeMillis())
						
						query = "INSERT into Notifications (topic,timestamp,status) VALUES " + "('${topic}', '${date}', '${status}')"
						sql.execute(query); // the table / code supports duplicate entry
						// generally they are to be handled explicitly as shown in cases 2 and 4
						
						println "Inserted successfully"
						
						break;
				case 4:	println "\nEnter the index you want to delete: "
						slNo = System.in.newReader().readLine() as Integer; 
						check = false;
						sql.eachRow("SELECT * from NOTIFICATIONS where slNo ="+"${slNo}" ) 
						{  	// validating input in the database
							check = true;
						}
						if( !check )
							println "\nIndex not found.\n"
						else
						{
							sql.execute("DELETE from NOTIFICATIONS where slNo ="+"${slNo}")
							println "\nSuccessfully deleted.\n"
						}
						
						break;
				case 5:	println "\nThank you. You have ended the process."
						System.exit(0);
				default: println "\nInvalid choice. Re-enter please...\n"
						 break;
			}
		}
		
	   
	}
}
