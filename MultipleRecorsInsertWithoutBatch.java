package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MultipleRecorsInsertWithoutBatch {

	public static void main(String[] args) {
		try {
	    	 System.out.println("start");
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	 Statement st=con.createStatement();
	    	 Scanner sn=new Scanner(System.in);
	    	 while(true) {
	    	 System.out.println("enter id,name,age");
	    	 int id=sn.nextInt();
	    	 String name=sn.next();
	    	 int age=sn.nextInt();
	    	 String sql="insert into values("+id+",'"+name+"',"+age+")";
	    	 int i= st.executeUpdate(sql);
	    	 if(i>0) {
	    		 System.out.println("inserted recors successful");
	    	 }
	    	 System.out.println("do u want insert more records");
	    	 String input=sn.next();
	    	 if(!input.equals("yes")) {
	    		break;
	    	 }
	}

}catch(Exception e) {
	System.out.println(e);
}
	}
}
