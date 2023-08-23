package com.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee
{
  private static Connection con;
  private static PreparedStatement ps;
  
  public static void main(String[] args) throws Exception
  {
	Scanner sc =new Scanner(System.in);
	System.out.println("\n ************* Welcome To Employee Management App ***********\n");
	
	while(true)
	{
		System.out.println("1. Insert Employee Data 	press 1");
		System.out.println("2. Delete Employee Data 	press 2");
		System.out.println("3. Display Employee Data 	press 3");
		System.out.println("4. Update Employee Data 	press 4");
		System.out.println("5. Search Employee Data 	press 5");
		System.out.println("6. Exit		press 6");
		
		System.out.println("\n  Enter Your Choice ");
		
		int ch = Integer.parseInt(sc.next());
		
		switch(ch)
		{
		case 1:
			   System.out.println("\n    Enter Employee Details");
			   System.out.println("Enter Employee ID NO :- ");
			   int id = sc.nextInt();
			   System.out.println("Enter Employee First Name :-");
			   String name = sc.next();
			   System.out.println("Enter Employee SurName :-");
			   String surname = sc.next();
			   System.out.println("Enter Employee Age :-");
			   int age = sc.nextInt();
			   System.out.println("Enter Employee Date of Birth :-");
			   String dob = sc.next();
			   System.out.println("Enter Gender :-");
			   String gender = sc.next();
			   System.out.println("Enter Employee contact Number :-");
			   String contact = sc.next();
			   System.out.println("Enter Year Of Joining :- ");
			   String yoj = sc.next();
			   System.out.println("Enter Department :- ");
			   String department = sc.next();
			   System.out.println("Enter Salary :- ");
			   float salary = sc.nextFloat();
			   
			   EmployeeData ed = new EmployeeData(id,name,surname,age,dob,gender,contact,yoj,department,salary);
			   boolean ans = EmployeeCon.InsertDB(ed);
			   if(ans)
			   {
				   System.out.println("Employee added Successfully..........");
			   }
			   else
			   {
				   System.out.println("Something went wrong.............");
			   }
			   break;
	    
		case 2:
			   System.out.println("Enter Employee Name to Delete record :-");
			   name = sc.next();
			   EmployeeCon.deleteDB(name);
			   
			   break;
		case 3:
			   EmployeeCon.displayDB();
			   System.out.println("");
			   
			   break;
		case 4: 
			  System.out.println("Enter Employee Name to Upadte Record :-");
			  name = sc.next();
			  EmployeeCon.updateDB(name);
			  
			  break;
		case 5:
			  System.out.println("Search By First Name:- ");
			  String s= sc.next();
			  EmployeeCon.searchDB(s);
			  
			  break;
		case 6:
			  System.out.println("Thank You !!!.....");
			  break;
		}
		if(ch == 6)
			break;
	}
  }
}
