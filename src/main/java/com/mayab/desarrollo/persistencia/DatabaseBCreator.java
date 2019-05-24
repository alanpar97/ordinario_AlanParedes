package com.mayab.desarrollo.persistencia;

public class DatabaseBCreator extends DatabaseCreator{

	@Override
	public Framework createDatabase(String database) {
		if(database.equals("Database B")) {
			return new DatabaseB();
		}
		else {
			return null;
		}
	}

	
}
