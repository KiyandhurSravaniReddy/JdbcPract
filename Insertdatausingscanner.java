package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertdatausingscanner {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");
			Scanner sn=new Scanner(System.in);
			while(true) {
				System.out.println("enter id,name,address, mobile");
				int id=sn.nextInt();
				String name=sn.next();
				String address=sn.next();
				String mobile=sn.next();
				ps.setInt(1, id);
				ps.setString(2,name);
				ps.setString(3, address);
				ps.setString(4, mobile);
				int i=ps.executeUpdate();
				if(i>0) {
					System.out.println("do u want to insert more records");
					String input = sn.next();
					if(!input.equals("yes")) {
						break;
					}
				}
				System.out.println("end");
			}
			
				sn.close();
				ps.close();
				con.close();
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
