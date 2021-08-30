package com.greatlearning.driver;
import com.greatlearning.employee.*;
import com.greatlearning.credentials.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Employee employee=new Employee("Sahadeo","Sawant");
		CredentialServices cs= new CredentialServices();
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		System.out.print("Enter desired department:");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		
		String department="";
		String emailAddress="";
		char[] password=new char[8];
		
		cs.showCredentials(employee,emailAddress,password);
		
		switch(choice) {
		case 1:{
			employee.setDepartment("Technical");
			System.out.println(cs.generateEmailAddress(employee,department));
			System.out.println(cs.generatePassword());
		}
			break;
		case 2:{
			employee.setDepartment("Admin");
			System.out.println(cs.generateEmailAddress(employee, department));
			System.out.println(cs.generatePassword());
		}
			break;
		case 3:{
			employee.setDepartment("HR");
			System.out.println(cs.generateEmailAddress(employee, department));
			System.out.println(cs.generatePassword());
		}
			break;
		case 4:{
			employee.setDepartment("Legal");
			System.out.println(cs.generateEmailAddress(employee, department));
			System.out.println(cs.generatePassword());
		}
		    break;
		    }
		sc.close();
		}
	}