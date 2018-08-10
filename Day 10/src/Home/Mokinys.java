package Home;

import java.io.Serializable;

public class Mokinys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public String name;
	public String surename;
	
	
	public Mokinys(String name, String surename) {
		this.name = name;
		this.surename = surename;
	}
	
	public String getFullName() {
		return name + " " + surename;
	}

	@Override
	public String toString() {
		return "Mokinys " + name + ", surename " + surename + "\n";
	}
	
	
}
