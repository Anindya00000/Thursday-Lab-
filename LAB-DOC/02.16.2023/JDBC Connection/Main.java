package com.studentManagement;

import java.util.Scanner;

public class Main                       //Main class where 'main method' exists 
{
	public static void main(String [] args)    
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Do you want to create a Student Table: ");
	    String ch1 = sc.nextLine();
	    if(ch1.equalsIgnoreCase("yes"))
	    {
	      CreateTable.createTable();
	      int ch=0;
	      do{
		  System.out.print("\n1.Show all student details \n2.Insert a new student details \n3.Delete a student details \n4."
				+ "Update a Student details\n5.Search a student details\n6.Exit: \nEnter your choice: ");
		  ch = sc.nextInt();
		  switch(ch)
		  {
			 case 1:
				 Select_DESC.showData();
			  break;
			 case 2:
				 Operation_I_D_U.Insert();
			  break;
			 case 3:
				 Operation_I_D_U.Delete();
			  break;
			 case 4:
				 Operation_I_D_U.Update();
			  break;
			 case 5:
				 Select_DESC.Search();
			 case 6:
			  break;
			 default:
			   System.out.println("\nInvalid Choice.\n");
		 }
	    }while(ch!=6);
	   }
	   else
	   {
		   System.out.println("--Okay--");
	   }
	}
}
