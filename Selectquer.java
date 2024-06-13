package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Selectquer {

	public static void main(String[] args) {
   try {
	   System.out.println("start");
	   Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
	   Statement st=con.createStatement();
	   String sqlquery="select * from product";
	   ResultSet rs=st.executeQuery(sqlquery);
	   ResultSetMetaData rsmd=rs.getMetaData();
	   int columnscount=rsmd.getColumnCount();
	   System.out.println("columnscount= "+columnscount);
	   for(int i=1;i<=columnscount;i++) {
			   System.out.print(rsmd.getColumnName(i)+"\t");
	   }
	   System.out.println();
	   while(rs.next()) {
		   for(int x=1; x<=columnscount; x++) {
			   System.out.println(rs.getString(x)+"\t");
		   }
	   }
	   st.close();
	   con.close();
	   System.out.println("end");
   }catch(Exception e) {
	   System.out.println(e);
   }
	}

}
