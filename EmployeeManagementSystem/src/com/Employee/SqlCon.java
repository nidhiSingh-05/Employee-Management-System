package com.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCon 
{
// static Connection con;
// public static Connection creatC()
// {
//	 try
//	 {
//		 Class.forName("com.mysql.cj.jdbc.Driver");
//		 
//		 String url = "jdbc:mysql://loalhost:3306/demo";
//		 String user ="root";
//		 String pass ="root";
//		 
//		 con = DriverManager.getConnection(url,user,pass);
//	 }
//	 catch(ClassNotFoundException | SQLException e)
//	 {
//		 e.printStackTrace();
//	 }
//	 return con;
// }
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	 public static final String JDBC_URL = "jdbc:mysql://localhost:3306/demo";
	 public static final String USER = "root";
	 public static final String PASS = "root";
	 public static Connection con = null;
	 
	 public static Connection creatC()
	 {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded .....");
			
			System.out.println("Connecting to data base.....");
			con = DriverManager.getConnection(JDBC_URL,USER,PASS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 return con;
	 }
}
