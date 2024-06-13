package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExecuteQuery {

	public static  void main(String[] args) {
		try {
	    	 System.out.println("start");
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	 PreparedStatement pst=con.prepareStatement("select * from Users");
	    	 Scanner sn=new Scanner(System.in);
	    	 while(true) {
	    		 System.out.println("you are fetching recors from users tables");
	    		 int id=sn.nextInt();
	    		 pst.setInt(1, id);
	    		 java.sql.ResultSet rs=pst.executeQuery();
	    		 while(rs.next()) {
	    			 System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
	    			 
	    		 }
	    		 rs.close();
	    		 System.out.println("do u want more");
	    		 String input =sn.next();
	    		 if(input.equals("yes")) {
	    			 
	    		 }else {
	    			 break;
	    		 }
	    		 pst.close();
	    		 con.close();
	    		 
	    		 
	    		 
	    	 }
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
