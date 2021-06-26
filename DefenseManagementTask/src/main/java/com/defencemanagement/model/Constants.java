package com.defencemanagement.model;

import java.sql.Connection;
import java.sql.DriverManager;
public class Constants {
	public static String DB_USR_NAME = "root";

	public static String DB_PWD = "root";

	public static String DB_URL ="jdbc:mysql://localhost:3306/mysql";
	public  void loaddriver()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		
	}
	public static Connection getConncetion()
	{
		Connection con=null;
		try
		{
			con=DriverManager.getConnection(DB_URL,DB_USR_NAME,DB_PWD );
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		return con;
		
	}
}


