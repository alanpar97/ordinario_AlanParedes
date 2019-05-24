package com.mayab.desarrollo.persistencia;

import java.util.Scanner;

public class PersistenciaController {

	public static void main(String[] args) {
		
		//Creating the creators
		DatabaseACreator da = new DatabaseACreator();
		DatabaseBCreator db = new DatabaseBCreator();
		DatabaseCCreator dc = new DatabaseCCreator();

		Scanner scan = new Scanner(System.in);
		
		//Query
		String query = "SELECT 'id','NAME','email' FROM 'students';";
		
		System.out.println("Testing query: "+query);
		
		//Selecting Database
		System.out.println("Select a Database: ");
		System.out.println("A: Database A  || B: Database B  || C: Database C ");
		
		String option = scan.nextLine();
		
		Framework database = new DatabaseA(); //Only for default
		if(option.equals("A")) {
			database = da.createDatabase("Database A");
		}
		else if(option.equals("B")) {
			database = db.createDatabase("Database B");
		}
		else if(option.equals("C")) {
			database = dc.createDatabase("Database C");
		}
		
		database.save(query);
	}

}
