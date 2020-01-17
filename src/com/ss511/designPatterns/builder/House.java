package com.ss511.designPatterns.builder;

public class House implements HousePlan{

	private String roof;
	private String basement;
	private String wall;
	@Override
	public void setRoof(String roof) {
		this.roof = roof;	
	}

	@Override
	public void setBasement(String basement) {
		this.basement = basement;
	}

	@Override
	public void setWall(String wall) {
		this.wall = wall;		
	}

	public String getRoof() {
		return roof;
	}

	public String getBasement() {
		return basement;
	}

	public String getWall() {
		return wall;
	}
	
	@java.lang.Override
    public String toString() {
      return "Created basement = " + this.getBasement() + ", wall = " + this.getWall() + ", roof = " + this.getRoof();
    }

}
