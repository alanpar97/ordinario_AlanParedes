package com.mayab.desarrollo.persistencia;

public class DatabaseA extends Framework{

	public DatabaseA() {}
	

	@Override
	public String createSentence(String sentence) {
		return sentence.toUpperCase();
	}
}
