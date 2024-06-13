package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) {
		try {
	    	System.out.println("execution started");
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	Statement st=con.createStatement();
	    	String insertquery= "insert into Users values(2,'mohan', 18)";
	    	String updatequery= "update Users set name='loki' where id=2";
	        System.out.println("insertquery= "+insertquery);
	        System.out.println("updatequery= "+updatequery);
	        st.addBatch(insertquery);
	        st.addBatch(updatequery);
	        st.executeBatch();
	        //System.out.println("insert operation= "+effectedrowscount[0]);//
	        //System.out.println("update operation= "+effectedrowscount[1]);//
	    	st.close();
	    	con.close();
	    	System.out.println("execution stopped");
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
		}

	}


