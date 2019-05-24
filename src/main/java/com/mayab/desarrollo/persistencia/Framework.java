package com.mayab.desarrollo.persistencia;

public abstract class Framework {

	public final void save(String sentence) {
		this.openConnection();
		String query = this.createSentence(sentence);
		this.executeQuery(query);
	}
	
	public final void openConnection() {
		System.out.println("Opening "+ this.getClass().getSimpleName()+ " connection.");
	}
	
	public abstract String createSentence(String sentence);
	
	public final void executeQuery(String query) {
		System.out.println("Query: "+query);
		System.out.println("Query executed");
	}
}
