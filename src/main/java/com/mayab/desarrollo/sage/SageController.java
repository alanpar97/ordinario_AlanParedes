package com.mayab.desarrollo.sage;

import java.util.Scanner;

public class SageController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Creating Client
		Client ibm = new Client("IBM", "Armonk, New York");
		//Creating system SAGE. Current max amount of 2500 EUR
		Sage sage = new Sage(ibm, 2500);
		//Creating manager
		Manager alan = new Manager("Alan Paredes");
		//Assigning manager to client
		ibm.setManager(alan);
		//Giving manager access to expenses list
		ibm.getManager().setList(sage.getExpenses());
		sage.getExpenses().addObserver(ibm.getManager());
		
		System.out.println("---First Adquisition---");
		//First adquisition
		Integer id = new Integer(1);
		Double amount = new Double(2700);
		String description = "Computers";
	
		//Recording expense
		sage.recordExpense(id, amount, description);
		System.out.println("----Changing Notifications----");
		//Change notification
		sage.changeNotifications();
		
		System.out.println("----Second Adquisition----");
		//Second adquisition
		id = new Integer(2);
		amount = new Double(3500);
		description = "Laptops";
		
		//Recording expense
		sage.recordExpense(id, amount, description);
		
		System.out.println("---Adding Politic----");
		System.out.println("Write the politic that you want to implement for notifications");
		String politic = scan.nextLine();
		sage.addPolitic(politic);
		
		System.out.println("---Third Adquistion---");
		//Third adquisition
		id = new Integer(3);
		amount = new Double(4700);
		description = "Chips";
		
		//Recording expense
		sage.recordExpense(id, amount, description);

		System.out.println("---Print Log---");
		sage.printLog();
		
		scan.close();
	}

}
