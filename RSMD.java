package com.srish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RSMD {

	public static void main(String[] args) {
    try {
    	System.out.println("start");
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani","admin","DevOps123");
    	Statement st=con.createStatement();
    	String sql="select*from product";
    	ResultSet r=st.executeQuery(sql);
    	ResultSetMetaData rsmd=r.getMetaData();
    	int columnscount=rsmd.getColumnCount();
    	System.out.println("column count= "+columnscount);
    	for(int i=1; i<=columnscount;i++) {
    		System.out.println(rsmd.getColumnName(i)+"\t");
    	}
    	System.out.println();
    	while(r.next()) {
    		for(int x=1;x<=columnscount;x++) {
    			System.out.println(r.getString(x)+"\t");
    		}
    	}
    	r.close();
    	st.close();
    	con.close();
    	System.out.println("end");
    }catch(Exception e) {
    	System.out.println(e);
    }
	}

}
