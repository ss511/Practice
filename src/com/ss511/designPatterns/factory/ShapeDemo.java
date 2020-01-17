package com.ss511.designPatterns.factory;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape shape = ShapeFactory.getShapeFactory("CIRCLE");
		shape.printShape();
		
		shape = ShapeFactory.getShapeFactory("SQUARE");
		shape.printShape();
		
		shape = ShapeFactory.getShapeFactory("AAA");
		System.out.println("Shape is null " + shape );
	}

}
