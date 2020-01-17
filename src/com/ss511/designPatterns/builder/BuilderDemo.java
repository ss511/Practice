package com.ss511.designPatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {

		HouseBuilder apartmentBuilder = new ApartmentHouseBuilder();
		HouseBuilderEngineer engineer = new HouseBuilderEngineer(apartmentBuilder);
	
		engineer.buildHouse();
		
		House house = engineer.getHouse();
		
		System.out.println("Built House:: " + house.toString());
		
	}

}
