package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Add_Batch {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
			Statement st=con.createStatement();
			String insertquery="insert into person values (5,'kmr','srinivasulu',6767676767,)";
			String updatequery="update person set id=1 where age=18";
			String deletequery="delete from person where id=3";
			st.addBatch(insertquery);
			st.addBatch(updatequery);
			st.addBatch(deletequery);
			int effectedrowcount[]=st.executeBatch();
     		System.out.println("insert operation= "+effectedrowcount[0]);
			System.out.println("insert operation= "+effectedrowcount[0]);
			System.out.println("delete operation= "+effectedrowcount[1]);

		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
