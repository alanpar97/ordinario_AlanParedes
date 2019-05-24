package com.mayab.desarrollo.persistencia;

public class DatabaseB extends Framework{
	
	public DatabaseB() {}

	@Override
	public String createSentence(String sentence) {
		return sentence.toLowerCase();
	}
	
	

}
