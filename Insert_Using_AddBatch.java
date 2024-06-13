package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Savepoint;

public class Insert_Using_AddBatch {

	public static void main(String[] args) {
		 try {
	    	 System.out.println("start");
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
	    	 con.setAutoCommit(false);
	    	 String sql="update place set pname=? where id=?";
	    	 PreparedStatement pst=con.prepareStatement(sql);
	    	 pst.setString(1, "amma");
	    	 pst.setInt(2, 3);
	    	 pst.addBatch();
	    	 pst.setString(1, "daddy");
	    	 pst.setInt(2, 4);
	    	 pst.addBatch();
	    	 Savepoint sp=con.setSavepoint("sp1");
	    	 pst.setString(1, "mom");
	    	 pst.setInt(2, 2);
	    	 pst.addBatch();
	    	 int []i=pst.executeBatch();
	    	 System.out.println("1st= "+i[0]+"2nd= "+i[1]+"3rd= "+i[2]);
	    	 con.rollback();
	    	 con.commit();
		 }catch(Exception e) {
			 System.out.println(e);
		 }

}
}