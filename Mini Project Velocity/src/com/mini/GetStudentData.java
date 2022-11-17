package com.mini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetStudentData {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID to See Your Information:-");
		
		int id = sc.nextInt();
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement ps = null;
		
		
		
		try {
			String sql = "select * from student where id=?";
			ps =con.prepareStatement(sql);
			
			ps.setInt(1,id);
			
		    ResultSet rs =ps.executeQuery();
		    
		    while(rs.next()) {
		    	
		    	System.out.println("Your name is:-"+rs.getString(1));
		     	System.out.println("Your ID is:-"+rs.getInt(2));
		     	System.out.println("Your Score is:-"+rs.getString(3));
		   
		    	
		    }
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				ps.close();
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
