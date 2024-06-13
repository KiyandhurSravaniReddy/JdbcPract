package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_Using_Scanner{

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");

			Statement st = con.createStatement();

			Scanner sn = new Scanner(System.in);

			System.out.println("Enter uID and uname to update");

			int uid = sn.nextInt();
			String uname = sn.next();

			String sqlUpdate = "update user set uname=" + uname + " where uid = " + uid;

            int count = st.executeUpdate(sqlUpdate);
            
            System.out.println("updated records count = "+count);
			
            sn.close();
			st.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
