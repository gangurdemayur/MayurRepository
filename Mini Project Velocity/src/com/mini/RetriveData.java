package com.mini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class RetriveData {
	
	public static LinkedHashMap<String, String> hs = new LinkedHashMap<String,String>();
	
	@SuppressWarnings("finally")
	public static LinkedHashMap<String, String> getRecordInLinkedHashmap(){
	
	//public static void main(String[] args) {
		
		
	
		Connection con = DBConnection.getConnection();
		
		PreparedStatement ps =null;
		
		String url = "Select * from quize";
		
		try {
			ps =con.prepareStatement(url);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				
				
				hs.put(rs.getString(1), rs.getString(2));
				
				//System.out.println("Question:-"+rs.getString(1));
				
				//System.out.println("Answers:-"+rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			return hs;
		}
		
//		
//	Set<String> set =hs.keySet();
//	
//	Iterator<String> itr =set.iterator();
//	
//	while(itr.hasNext()) {
//		
//		System.out.println(itr.next());
//		
	//}
	
	
	}

}
