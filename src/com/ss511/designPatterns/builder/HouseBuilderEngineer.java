package com.ss511.designPatterns.builder;

public class HouseBuilderEngineer {

	private HouseBuilder houseBuilder;
	
	public HouseBuilderEngineer (HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}
	
	public void buildHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildWall();
		this.houseBuilder.bulidRoof();
	}
}
