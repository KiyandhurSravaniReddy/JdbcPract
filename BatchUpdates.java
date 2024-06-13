package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdates {

	public static void main(String[] args) {
		 try {
	    	 System.out.println("start");
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	 Statement st=con.createStatement();
	    	 String insert="insert into Users values(5,'gopi',38)";
	    	 String update="update Users set id=4 where age=45";
	    	 String delete="delete from Users where age=22";
	    	 System.out.println("insert= "+insert);
	    	 System.out.println("update= "+update);
	    	 System.out.println("delete= "+delete);
	    	 st.addBatch(insert);
	    	 st.addBatch(update);
	    	 st.addBatch(delete);
	    	 int effectedrows[]=st.executeBatch();
	    	 System.out.println("insert effected= "+effectedrows[0]);
	    	 System.out.println("update effected= "+effectedrows[0]);
	    	 System.out.println("delete effected= "+effectedrows[0]);
            st.close();
            con.close();

	}catch(Exception e) {
   	 System.out.println(e);

	}

	}
}
