package com.ss511.designPatterns.builder;

public interface HouseBuilder {

	public void buildBasement();  
  
    public void bulidRoof(); 
  
    public void buildWall(); 
  
    public House getHouse();
}
