package com.srish;

import java.sql.DriverManager;
import java.sql.Connection;

public class multiplecoonnections {

	public static void main(String[] args) {
     try {
    	 System.out.println("start");
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con1=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
    	 Connection con2=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
    	 Connection con3=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
         System.out.println("con1 obj= "+con1);
         System.out.println("con2 obj= "+con2);
         System.out.println("con3 obj= "+con3);
         con1.close();
         con2.close();
         con3.close();
         System.out.println("ended");
         }
       catch(Exception e) {
    	   System.out.println(e);
       }
	}

}
