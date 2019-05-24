package com.mayab.desarrollo.ibm;

public class ClientAdapter implements NewClient {

	public OldClient client;
	
	public ClientAdapter(OldClient client) {
		this.client = client;
	}

	public void setName(String name) {
		String[] fullName = client.getFullName().split("\\s");
		this.client.setFullName(name +" "+fullName[1]);
		
	}

	public void setLastName(String lastName) {
		String[] fullName = client.getFullName().split("\\s");
		this.client.setFullName(fullName[0] +" "+lastName);
		
	}

	public String getName() {
		String[] fullName = client.getFullName().split("\\s");
		return(fullName[0]);
	}

	public String getLastName() {
		String[] fullName = client.getFullName().split("\\s");
		return(fullName[1]);
	}
	
	
}
