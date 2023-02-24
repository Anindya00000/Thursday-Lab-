package com.studentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Operation_I_D_U 
{
	public static void Insert()   //  to insert a student details
	{
	  try
	  {
		Scanner sc=new Scanner(System.in);
	    Connection conn=DataBaseConnection.getDbConnection();
	    Statement st=conn.createStatement();
	    System.out.println("Enter ROLL: ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NAME: ");
		String name=sc.nextLine();
		System.out.println("Enter MARKS: ");
		int marks=sc.nextInt();
		System.out.println("Enter FEES: ");
		float fees=sc.nextFloat();
	    String sql="INSERT INTO STUDENT VALUES('"+roll+"','"+name+"','"+marks+"','"+fees+"');";
	    int rs = st.executeUpdate(sql);
		if(rs>0)
			  System.out.println("--Inseted--");
	    conn.close();
	  }
	  catch(Exception e)
	  {
		System.err.println(e);
	  }
    }
	
	public static void Delete()           //  to delete a student details
	{
	  try
	  {
		Scanner sc=new Scanner(System.in);
	    Connection conn=DataBaseConnection.getDbConnection();
	    Statement st=conn.createStatement();
	    System.out.println("Enter Student ROLL to Delete the Student deatils : ");
		int roll=sc.nextInt();
	    String sql="DELETE FROM STUDENT WHERE ROLL ='"+roll+"';";
	    int rs1 = st.executeUpdate(sql);
	    if(rs1>0)
			  System.out.println("--Deleted--");
		else
			  System.out.println("--Student Not Found--");
	    conn.close();
	  }
	  catch(Exception e)
	  {
		System.err.println(e);
	  }
    }
	
	public static void Update()            // to update a student details
	{
	  try
	  {
		Scanner sc=new Scanner(System.in);
	    Connection conn=DataBaseConnection.getDbConnection();
	    Statement st=conn.createStatement();
	    System.out.println("Enter Student ROLL to Update the Student deatils : ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NAME: ");
		String name=sc.nextLine();
		System.out.println("Enter MARKS: ");
		int marks=sc.nextInt();
		System.out.println("Enter FEES: ");
		float fees=sc.nextFloat();
		String sql="UPDATE STUDENT SET NAME='"+name+"',MARKS='"+marks+"',FEES='"+fees+"'where ROLL='"+roll+"'";
	    int rs1 = st.executeUpdate(sql);
	    if(rs1>0)
			  System.out.println("--Successfully Updated--");
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
