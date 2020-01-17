package com.ss511.designPatterns.factory;

public class ShapeFactory {

	public static Shape getShapeFactory (String shapeType) {
		
		switch (shapeType) {
			
		case "CIRCLE": 
			return new Circle();
			
		case "SQUARE":
			return new Square();
			
		default:
			return null;
		}
	}
}
