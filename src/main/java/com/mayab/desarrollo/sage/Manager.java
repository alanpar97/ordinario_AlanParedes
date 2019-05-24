package com.mayab.desarrollo.sage;

public class Manager implements Observer {

	public String name;
	public Observable listExpenses;
	public SendingBehaviour sendingBehaviour;
	
	public Manager(String name) {
		this.setName(name);
		this.sendingBehaviour = new SendingBoth();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setList(Observable list) {
		this.listExpenses = list;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Observable getList() {
		return this.listExpenses;
	}
	
	public SendingBehaviour getSendingBehaviour() {
		return sendingBehaviour;
	}

	public void setSendingBehaviour(SendingBehaviour sendingBehaviour) {
		this.sendingBehaviour = sendingBehaviour;
	}
	
	public String update(Integer id, Double amount, String description) {
		this.sendingBehaviour.send();
		System.out.print("Id of expense: "+id.toString()+ " ");
		System.out.print("Amount: "+amount.toString()+" ");
		System.out.println("Description: "+description);
		
		String log = "Id of expense: " +id.toString() + " Amount: " + amount.toString() + " Description: "+description;
		return log;
	}
	
	
}
