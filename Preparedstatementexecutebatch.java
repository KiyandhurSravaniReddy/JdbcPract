package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedstatementexecutebatch {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin",
					"DevOps123");
			System.out.println("con = "+con);
			String updatequery="update 310_sravani.person set mobile=? where id=?";
			PreparedStatement ps=con.prepareStatement(updatequery);
			ps.setString(1, "777777777");
			ps.setInt(2, 5);
			ps.addBatch();
			int [] rows=ps.executeBatch();
			System.out.println("1st= "+rows[0]);
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
