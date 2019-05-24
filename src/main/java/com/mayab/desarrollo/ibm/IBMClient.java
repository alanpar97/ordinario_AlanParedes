package com.mayab.desarrollo.ibm;

public class IBMClient implements OldClient {

	public String fullName;
	
	public IBMClient(String fullName) {
		this.setFullName(fullName);
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
		
	}
	
	
}
