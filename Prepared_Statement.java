package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Prepared_Statement {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
			PreparedStatement ps=con.prepareStatement("insert into store values(?,?,?,?,?)");
			Scanner sn=new Scanner(System.in);
			while(true) {
				System.out.println("enter id,item,price,sellingprice,profit to insert");
				int id=sn.nextInt();
				String item=sn.next();
				int price=sn.nextInt();
				int sellingprice=sn.nextInt();
				int profit=sn.nextInt();
				ps.setInt(1, id);
				ps.setString(2, item);
				ps.setInt(3, price);
				ps.setInt(4, sellingprice);
				ps.setInt(5, profit);
				int i=ps.executeUpdate();
				if(i>0) {
					System.out.println("records are inserted");
				}
				System.out.println("do u want to insert more record");
				String input=sn.next();
				if(!input.equals("yes")) {
					break;
				}
				
				
			}
	}catch(Exception e) {
		System.out.println();
	}

}}
