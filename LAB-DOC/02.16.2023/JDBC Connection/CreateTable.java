package com.studentManagement;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable 
{
	public static void createTable()  //to create a student table
	{
		try
		{
		    Connection conn=DataBaseConnection.getDbConnection();
			Statement st=conn.createStatement();
			String sql="CREATE TABLE STUDENT(ROLL BIGINT(10)PRIMARY KEY,NAME VARCHAR(30),"
					+ "MARKS BIGINT(10),FEES FLOAT(7,2));";
			st.executeUpdate(sql);
			System.out.println("Table created successfully");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Table is Already Exist.");
		}

	}

}