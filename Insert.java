package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		try {
			System.out.println("start");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
		Statement st=con.createStatement();
		String sql="insert into employee values(4, 'k.lokesh','employe',89898,'2222222222')";
		int effectedrows=st.executeUpdate(sql);
		System.out.println("inserted rows= "+effectedrows);
		System.out.println("end");
		st.close();
		con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
