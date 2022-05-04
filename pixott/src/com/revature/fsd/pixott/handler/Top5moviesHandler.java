package com.revature.fsd.pixott.handler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.fsd.pixott.dao.Util;

public class Top5moviesHandler {
	public static void top5() {
	String sql = "select * from top5movie";
	try (
			Connection conn = Util.getConnection(); 
			PreparedStatement stmt = conn.prepareStatement(sql);
			)
	{
		
	    ResultSet rs = stmt.executeQuery();
	    while(rs.next()) {
	    	System.out.println(rs.getString("movies"));
	    }

	} catch (SQLException e) {
		System.out.println(e.getMessage());

	
	


}}}
