package com.mayab.desarrollo.sage;

import java.util.ArrayList;
import java.util.Scanner;

public class Sage {
	
	
	public ArrayList<String> log;
	public Expenses expenses;
	public Client client;
	public double maxAmount;
	
	public Sage(Client client, double maxAmount) {
		this.log = new ArrayList<String>();
		this.expenses = new Expenses();
		this.client = client;
		this.maxAmount = maxAmount;
		
	}
	
	
	public double getMaxAmount() {
		return this.maxAmount;
	}
	
	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}
	
	
	public ArrayList<String> getLog() {
		return this.log;
	}
	
	public void addToLog(String log) {
		 this.log.add(log);
	}
	
	public void printLog() {
		for(int i=0; i<log.size(); i++) {
			System.out.println(this.getLog().get(i));
		}
	}
	
	public Expenses getExpenses() {
		return this.expenses;
	}
	
	public void recordExpense(Integer id, Double amount, String description) {
		this.expenses.newRecord(id, amount, description);
		if(this.maxAmount < amount){
			String log = this.expenses.notifyObserver();
			this.addToLog(log);
		}
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void changeNotifications() {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		System.out.println("To change how to send notifications: ");
		System.out.println("Select 1 for receive emails and SMS");
		System.out.println("Select 2 for receive only emails");
		System.out.println("Select 3 for receive only SMS");
		
		option = scan.nextInt();
		
		while(option < 1 || option > 3) {
			System.out.println("Choose a number from 1 to 3");
			option = scan.nextInt();
		}
		
		if(option == 1) {
			System.out.println("Option 1 was selected");
			SendingBehaviour sendingBehaviour = new SendingBoth();
			this.client.getManager().setSendingBehaviour(sendingBehaviour);
		}
		else if(option == 2) {
			System.out.println("Option 2 was selected");
			SendingBehaviour sendingBehaviour = new SendingEmail();
			this.client.getManager().setSendingBehaviour(sendingBehaviour);
		}
		else if(option == 3) {
			System.out.println("Option 3 was selected");
			SendingBehaviour sendingBehaviour = new SendingSMS();
			this.client.getManager().setSendingBehaviour(sendingBehaviour);
		}
		
		
	}
	
	public void addPolitic(String politic) {
		
		SendingBehaviour politicBehaviour = new SendingPolitic(politic, this.client.getManager().getSendingBehaviour());
		
		this.client.getManager().setSendingBehaviour(politicBehaviour);
		
	};
	
	
	
	
}
