package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

public class IBM {

	public ArrayList<IBMClient> clients;
	
	public IBM() {
		this.clients = new ArrayList<IBMClient>();
	}
	
	public void setNewClient(String fullName) {
		IBMClient client = new IBMClient(fullName);
		this.clients.add(client);
	}
	
	public void printList() {
		for(int i=0; i<this.clients.size();i++) {
			System.out.println("Full Name: "+this.clients.get(i).getFullName());
		}
	}
}
