package seed.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection{
	
  public static Connection getdbcConnection() throws Exception{
	
	        //Load the Driver
	        Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver Loaded");
			
			//Establish Connection between Java Application & Oracle Data Base
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anupam");
		
			return con;
 }
}