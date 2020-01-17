package com.ss511.designPatterns.builder;

public class ApartmentHouseBuilder implements HouseBuilder {

	private House house;
	
	public ApartmentHouseBuilder () {
		this.house = new House();
	}
	@Override
	public void buildBasement() {
		house.setBasement("Tiles Flooring");
	}

	@Override
	public void bulidRoof() {
		house.setRoof("Concrete Roof");
	}

	@Override
	public void buildWall() {
		house.setWall("Concrete Wall");
	}
	
	@Override
	public House getHouse() {
		return this.house;
	}

}
