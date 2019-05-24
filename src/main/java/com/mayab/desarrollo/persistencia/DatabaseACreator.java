package com.mayab.desarrollo.persistencia;

public class DatabaseACreator extends DatabaseCreator {

	@Override
	public Framework createDatabase(String database) {
		if(database.equalsIgnoreCase("Database A")){
			return new DatabaseA();
		}
		else {
			return null;
		}
	}

	
}
