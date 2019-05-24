package com.mayab.desarrollo.persistencia;

public class DatabaseCCreator extends DatabaseCreator{

	@Override
	public Framework createDatabase(String database) {
		if(database.equals("Database C")) {
			return new DatabaseC();
		}
		else {
			return null;
		}
	}

	
	
}
