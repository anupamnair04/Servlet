package com.crudtest;
import java.sql.*;

public class ConnectionDao {
    private static Connection con;

    public static Connection getCon() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anupam");
        }catch (Exception ex) {
            ex.printStackTrace();
        } 
        return con;
    }
}