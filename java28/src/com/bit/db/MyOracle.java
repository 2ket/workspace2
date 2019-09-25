package com.bit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracle {
	
	public static Connection getConnection(){
			Connection conn=null;
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String password="hr";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return conn;
			
	}
	

}
