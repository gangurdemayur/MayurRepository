package com.mini_project2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnetion {

	public static Connection getconnection() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/flipcard";;
			con = DriverManager.getConnection(url , "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
