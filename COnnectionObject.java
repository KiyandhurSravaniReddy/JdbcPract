package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;

public class COnnectionObject {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin",
					"DevOps123");
			System.out.println("con = "+con);
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
