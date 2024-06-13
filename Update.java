package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
			Statement st=con.createStatement();
			String update="update employee set esalary=200000 where id=3";
			int effectedrow=st.executeUpdate(update);
			System.out.println("effected rows= "+effectedrow);
			
			System.out.println("end");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
