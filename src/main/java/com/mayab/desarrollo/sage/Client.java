package com.mayab.desarrollo.sage;

public class Client {
	
	public String name;
	public String location;
	public Manager manager;
	
	public Client(String name, String location) {
		this.setName(name);
		this.setLocation(location);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
	
	
}
