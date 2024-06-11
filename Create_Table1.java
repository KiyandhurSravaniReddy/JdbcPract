package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Create_Table1 {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
			Statement st=con.createStatement();
			String sqlquery="create table employee(id int, ename varchar(20),eroll varchar(15), esalary int, emobile varchar(10))";
			int i=st.executeUpdate(sqlquery);
			System.out.println("i= "+i);
			System.out.println("end");	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
