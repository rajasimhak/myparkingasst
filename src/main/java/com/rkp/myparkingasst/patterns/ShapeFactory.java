package com.rkp.myparkingasst.patterns;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType) {
		if (shapeType == null || shapeType.equals("")) {
			return null;
		}
		
		if (shapeType.equals("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equals("SQUARE")) {
			return new Square();
		} else if (shapeType.equals("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
		
	}

}
