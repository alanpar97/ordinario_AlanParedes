package com.mayab.desarrollo.ibm;

public class IBMController {

	public static void main(String[] args) {
		
		//Create IBM Software
		IBM ibm = new IBM();
		
		//Create Billing Software
		ElectronicBilling eb = new ElectronicBilling();
		
		//Create some IBM Clients
		String alan = "Alan Paredes";
		String montoya = "Sebastian Montoya";
		
		//Add them to IBM list
		ibm.setNewClient(alan);
		ibm.setNewClient(montoya);
		
		//Print IBM's client list
		System.out.println("---IBM's Client List---");
		ibm.printList();
		
		//Time to pass the list to Client Adapter interface
		for(int i=0; i<ibm.clients.size();i++) {
			NewClient adapter = new ClientAdapter(ibm.clients.get(i));
			eb.setNewClient(adapter.getName(), adapter.getLastName());
		}
		
		//Print Billing Software's Client List
		System.out.println("---Billing Software's Client List---");
		eb.printList();
		
		
		

	}

}
