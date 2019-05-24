package com.mayab.desarrollo.sage;

import java.util.ArrayList;


public class Expenses implements Observable{

	public ArrayList<Integer> id;
	public ArrayList<Double> amount;
	public ArrayList<String> description;
	public ArrayList<Observer> observers;

	
	

	public Expenses() {
		this.id = new ArrayList<Integer>();
		this.amount = new ArrayList<Double>();
		this.description = new ArrayList<String>();
		this.observers = new ArrayList<Observer>();
		
	}
	
	
	public void newRecord(Integer id, Double amount, String description) {
		this.addId(id);
		this.addAmount(amount);
		this.addDescription(description);
	}
	
	
	/**
	 * @return the id
	 */
	public ArrayList<Integer> getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void addId(Integer id) {
		this.id.add(id);
	}

	/**
	 * @return the amount
	 */
	public ArrayList<Double> getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void addAmount(Double amount) {
		this.amount.add(amount);
	}

	/**
	 * @return the description
	 */
	public ArrayList<String> getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void addDescription(String description) {
		this.description.add(description);
	}

	/**
	 * @return the observers
	 */
	public ArrayList<Observer> getObservers() {
		return observers;
	}


	public void addObserver(Observer o) {
		this.observers.add(o);
		
	}

	public void deleteObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
		
	}

	public String notifyObserver() {
		String log = "";
		
		for(int i = 0; i <observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			//Reporting last record
			log = observer.update(id.get(id.size()-1), amount.get(amount.size()-1), description.get(description.size()-1));
		}
		return log;
		
	}
	
}
