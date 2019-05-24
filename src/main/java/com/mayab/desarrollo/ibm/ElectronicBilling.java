package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public class ElectronicBilling {

	public ArrayList<BillingClient> clients;
	
	public ElectronicBilling() {
		this.clients = new ArrayList<BillingClient>();
	}
	
	public void setNewClient(String name, String lastName) {
		BillingClient client = new BillingClient(name, lastName);
		this.clients.add(client);
	}
	
	public void printList() {
		for(int i=0; i<this.clients.size(); i++) {
			System.out.println("Name: "+ this.clients.get(i).getName() + " Last Name: "+this.clients.get(i).getLastName());
		}
	}
}
