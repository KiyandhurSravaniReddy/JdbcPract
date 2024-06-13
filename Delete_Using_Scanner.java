package com.srish;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;
		import java.util.Scanner;

		public class Delete_Using_Scanner {

			public static void main(String[] args) {
				try {
					System.out.println("start");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://database-1.ct80yu8w01i6.us-east-1.rds.amazonaws.com:3306/310_sravani", "admin", "DevOps123");
					Statement st=con.createStatement();
					Scanner sn=new Scanner(System.in);
					System.out.println("enter tid to delete");
					int tid=sn.nextInt();
					String delete="Delete from travel where tid= "+tid;
					int effectedrow=st.executeUpdate(delete);
					System.out.println("effected rows= "+effectedrow);
					System.out.println();
			}catch(Exception e) {
				System.out.println(e);
			}

		}

	}


