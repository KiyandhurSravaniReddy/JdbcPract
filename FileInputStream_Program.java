package com.srish;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Properties;

public class FileInputStream_Program {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			FileInputStream fis=new FileInputStream("D:\\Users\\srava\\eclipse-workspace\\JdbcPract\\src\\com\\srish\\db.properties");
			Properties p=new Properties();
			p.load(fis);
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String user=p.getProperty("user");
			String password=p.getProperty("password");
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=con.prepareStatement("select * from account_master");
			ResultSet rs = (ResultSet) ps.executeQuery(); 

			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int x=1;x<=rsmd.getColumnCount();x++) {
					System.out.println(rs.getString(x)+"\t");
				}
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
