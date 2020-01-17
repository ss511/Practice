package com.ss511.designPatterns.builder;

public class WoodenHouseBuilder implements HouseBuilder {

	private House house;
	
	public WoodenHouseBuilder () {
		this.house = new House();
	}

	@Override
	public HouseBuilder buildBasement() {
		house.setBasement("Wood Flooring");
		return this;
	}

	@Override
	public HouseBuilder bulidRoof() {
		house.setRoof("Wooden Roof");
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWall("Wooden Wall");
		return this;
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
