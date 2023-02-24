package com.studentManagement;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Select_DESC 
{
   public static void showData()          //to show all student details
   {
	   try
	   {
	      Connection conn=DataBaseConnection.getDbConnection();
		  Statement st=conn.createStatement();
		  String query1 = "SELECT * FROM STUDENT;";
		  ResultSet rs = st.executeQuery(query1);
		  while(rs.next())
		  {
		     System.out.println(rs.getInt("ROLL") + " "+ rs.getString("NAME") + " "+ rs.getInt("MARKS") + " "+ rs.getFloat("FEES"));
		  }
		  conn.close();
	   }
	   catch(Exception e)
	   {
		   System.out.println("--Not Found--");
	   }
   }
   public static void Search()                        // to search a student details
   {
	   try
	   {
		  Scanner sc=new Scanner(System.in);
	      Connection conn=DataBaseConnection.getDbConnection();
		  Statement st=conn.createStatement();
		  System.out.println("Enter Student ROLL to Search the Student deatils : ");
		  int roll=sc.nextInt();
		  String sql="SELECT * FROM STUDENT WHERE ROLL ='"+roll+"';";
		  ResultSet rs =st.executeQuery(sql);
		  if(rs.next())
		  {
		     System.out.println(rs.getInt("ROLL") + " "+ rs.getString("NAME") + " "+ rs.getInt("MARKS") + " "+ rs.getFloat("FEES"));
		  }
		  else
			  System.out.println("--Student Not Found--");
		  conn.close();
	   }
	   catch(Exception e)
	   {
			System.err.println(e);
	   }
   }
}
