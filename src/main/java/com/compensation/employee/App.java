package com.compensation.employee;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        int NumberOfEmployees = 0;
        String empID;
        String empName;
        char continues = 'y';
        int option;
        double empSalary;
        ArrayList<Employee> emp = new ArrayList<Employee>();
        
        while(continues!='n') {
        	
        	option = menu();
        	if(option==1) {
		        System.out.print("How many employees you want to add to your company? : ");
		        NumberOfEmployees = input.nextInt();
		        while(NumberOfEmployees<1) {
		        	System.out.print("Please enter number of your employees again? : ");
		            NumberOfEmployees = input.nextInt();
		        }
		        for (int i = 0; i < NumberOfEmployees; i++) {
		        	System.out.print("ID of employee "+(i+1)+" : ");
		        	empID = input.next();
		        	System.out.print("Name of employee "+(i+1)+" : ");
		        	empName = input.next();
		        	System.out.print("Salary of employee "+(i+1)+" : ");
		        	empSalary = input.nextDouble();
		        	Employee empOne = new Employee(empID,empName,empSalary);
					while(!empOne.isSalaryInBoundary(empSalary)) {
						System.out.print("Enter Salary of employee "+(i+1)+" Again : ");
						empSalary = input.nextDouble();
					}
					empOne.setSalary(empSalary);
		        	emp.add(empOne);
		        	System.out.println();
		        }
		        System.out.print("<-----Employee informations have been saved----->");
        	}
        	else if(option==2) {
        		System.out.print("\nPlease Enter Employee ID to proceed : ");
        		String keyID = input.next();
        		for (int i = 0; i < emp.size(); i++) {
        			if(emp.get(i).getEmpId().equals(keyID)) {
        				System.out.print(emp.get(i).displayEmployee());
        				System.out.print("\nEnter the sell that this employee make : ");
        				double sell = input.nextDouble();
        				while(!emp.get(i).isSellInBoundary(sell)) {
        					System.out.print("The sell might out range Try Again!\n");
        					System.out.print("Enter the sell that this employee make again : ");
        					sell = input.nextDouble();
        				}
        				emp.get(i).setSell(sell);
        				System.out.print(emp.get(i).toString());
        				break;
        			}
        			
        		}
        		System.out.println("\n<-----Adding Sell to Employee and Calculating Compensation Completed----->");
        	}
        	else if(option==3) {
        		System.out.println("\n<-----List of employees in this company----->");
        		System.out.print("This company has : "+emp.size()+" employees\n");
        		for (int i = 0; i < emp.size(); i++) {
        			System.out.print("\nEmployee number: "+ (i+1));
        			System.out.print(emp.get(i).displayEmployee()+"\n");
        		}
        		System.out.println("\n<------------------------------------------->");
        	}
        	
        	else if(option==4) {
        		continues = 'n';
        	}
        	
        	else {
        		System.out.println("Option is not defined");
        	}
        }
        System.out.print("Program has been stopped...");        
    }
    public static int menu() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("\n\nMenu\n[1]Add Employee\n[2]Add Sell to Employee\n[3]Display All Employees\n[4]End Program\n Please select option => ");
    	int choice = input.nextInt();
    	return choice;	
    }
    
}

