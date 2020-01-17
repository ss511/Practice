package com.ss511.designPatterns.builder;

public interface HouseBuilder {

	public HouseBuilder buildBasement();  
  
    public HouseBuilder bulidRoof(); 
  
    public HouseBuilder buildWall(); 
  
    public House getHouse();
}
