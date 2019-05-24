package com.mayab.desarrollo.sage;

public interface Observable {

	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public String notifyObserver();
}
