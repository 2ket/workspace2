package com.bit.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyOracle {
	public static Connection getConnection(){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e){
		}
		return conn;
}
}
