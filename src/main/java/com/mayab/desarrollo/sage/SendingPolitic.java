package com.mayab.desarrollo.sage;

public class SendingPolitic implements SendingBehaviour {

	public String politic;
	public SendingBehaviour sendingBehaviour;
	
	public SendingPolitic(String politic, SendingBehaviour sendingBehaviour) {
		this.sendingBehaviour = sendingBehaviour;
		this.politic = politic;
	}
	
	public void send() {
		System.out.print(politic + " ");
		sendingBehaviour.send();
		
	}
	
	public SendingBehaviour getSendingBehaviour() {
		return this.sendingBehaviour;
	}

}
