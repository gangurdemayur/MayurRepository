package com.mini_project2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductList {

	public static void main(String[] args) {

		Connection con = DBConnetion.getconnection();
		String quary = "select * from product";
		try {
			 PreparedStatement ps = con.prepareStatement(quary);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 System.out.println("ProductId>> " + rs.getString(1) );
				 System.out.println("Name>> " + rs.getString(2));
				 System.out.println("Desciption>> " + rs.getString(3));
				 System.out.println("Prize>> " + rs.getString(4));
				 System.out.println("Quantity>> " + rs.getString(5));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
