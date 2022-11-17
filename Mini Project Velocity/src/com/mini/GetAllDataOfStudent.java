package com.mini;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;


	public class GetAllDataOfStudent {
		public static void main(String[] args) {
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement ps = null;
			 System.out.println("Your Name \t"+"Id \t"+"Score");
			
			try {
				String sql = "select * from student order by name";
				ps =con.prepareStatement(sql);
				
			    ResultSet rs =ps.executeQuery();
			    
			    while(rs.next()) {
			    	
			    	System.out.print(rs.getString(1));
			     	System.out.print("\t"+rs.getInt(2));
			     	System.out.print("\t"+rs.getString(3));
			   
			     	System.out.println("\n");
			    	
			    }
				
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
			finally {
				
				try {
					ps.close();
					//sc.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}



