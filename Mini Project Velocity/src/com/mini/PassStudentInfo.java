package com.mini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class PassStudentInfo {
	
	
	static int count=0;
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name:-");
		String name = sc.nextLine();
		System.out.println("Enter your id:-");
		int id = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
        Connection con1 = DBConnection.getConnection();
		
		PreparedStatement ps1 = null;
		
		
		
		try {
			String sql = "select id from student";
			ps1 =con1.prepareStatement(sql);
			
			
			
		    ResultSet rs =ps1.executeQuery();
		    
		    while(rs.next()) {
		    	
		     al.add(rs.getInt(1));
		  }
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				ps1.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		
		for(Integer i: al) {
			if(id==i) {
				count++;
			}
		}
		
		if(count!=0) {
			System.out.println("Your Attempt is Alredy Completed");
		}
		
	else {
			
			int score =UseData.getscore();
		
		  char grade;
		 

		if(score<=10&&score>8) {
			grade = 'A';
			
			System.out.println("****** Congratulations ***** \nYour score is>>"+score+
					" \nYou get 'A' Grade");
		}else if(score<=8&&score>=6) {
			grade = 'B';
			System.out.println("****** Congratulations ***** \nYour score is>>"+score+
					" \nYou get 'B' Grade");
		}else if(score==5) {
			grade = 'C';
			System.out.println("****** Congratulations ***** \nYour score is>>"+score+
					" \nYou get 'c' Grade");
			
		}else if(score<5) {
			grade = 'D';
			System.out.println("****** You Are Falid ***** \nYour score is>>"+score+
					" \nYou get 'D' Grade");
		}
		
	
		
		
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps =null;
		
		
		try {
			String sql ="insert into student values(?,?,?)";
			ps =con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.setInt(3, score);
			
			int i =ps.executeUpdate();
			
			System.out.println("****** THANK YOU ******");
			
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

}
