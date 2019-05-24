package com.mayab.desarrollo.ibm;

public class BillingClient implements NewClient {

	public String name;
	public String lastName;
	
	public BillingClient(String name, String lastName) {
		this.setName(name);
		this.setLastName(lastName);
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	public String getName() {
		return this.name;
	}

	public String getLastName() {
		return this.lastName;
	}
	
}
