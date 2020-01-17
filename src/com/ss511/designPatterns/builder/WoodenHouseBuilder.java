package com.ss511.designPatterns.builder;

public class WoodenHouseBuilder implements HouseBuilder {

	private House house;
	
	public WoodenHouseBuilder () {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Wood Flooring");
	}

	@Override
	public void bulidRoof() {
		house.setRoof("Wooden Roof");
	}

	@Override
	public void buildWall() {
		house.setWall("Wooden Wall");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
