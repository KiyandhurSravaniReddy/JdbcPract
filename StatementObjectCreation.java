package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementObjectCreation {

	public static void main(String[] args) {
    try {
    	System.out.println("execution started");
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
    	Statement st=con.createStatement();
    	System.out.println("statement= "+st);
    	st.close();
    	con.close();
    	System.out.println("execution stopped");
    }catch(Exception e) {
    	System.out.println(e);
    }
	}

}
