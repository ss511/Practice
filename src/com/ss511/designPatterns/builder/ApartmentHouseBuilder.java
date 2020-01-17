package com.ss511.designPatterns.builder;

public class ApartmentHouseBuilder implements HouseBuilder {

	private House house;
	
	public ApartmentHouseBuilder () {
		this.house = new House();
	}
	@Override
	public HouseBuilder buildBasement() {
		house.setBasement("Tiles Flooring");
		return this;
	}

	@Override
	public HouseBuilder bulidRoof() {
		house.setRoof("Concrete Roof");
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWall("Concrete Wall");
		return this;
	}
	
	@Override
	public House getHouse() {
		return this.house;
	}

}
