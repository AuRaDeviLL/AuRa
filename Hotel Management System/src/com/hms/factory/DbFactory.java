package com.hms.factory;

import java.sql.*;

public class DbFactory {
	Connection con;
	
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digvijay","root","Digvij@y6");
		}
		catch (Exception e) {
			System.out.print(e);
		}
		return con;
	}
		
	public void closeCon() {
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
