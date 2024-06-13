package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_Using_AddBatch {

	public static void main(String[] args) {
		 try {
	    	 System.out.println("start");
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	 String sql="update travel set tname=? where tid=?";
	    	 PreparedStatement pst=con.prepareStatement(sql);
	    	 pst.setString(1,"mohan");
	    	 pst.setInt(2, 1);
	    	 pst.addBatch();
	    	 pst.setString(1, "sravs");
	    	 pst.setInt(2, 2);
	    	 pst.addBatch();
	    	 pst.setString(1, "loki");
	    	 pst.setInt(2, 3);
	    	 pst.addBatch();
	    	 int [] rec=pst.executeBatch();
	    	 System.out.println("1st= "+rec[0]+"2nd= "+rec[1]+"3rd= "+rec[2]);
	}catch(Exception e) {
		System.out.println(e);
	}

}}
