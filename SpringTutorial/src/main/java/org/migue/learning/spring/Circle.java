package org.migue.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private Point point;

	@Override
	public void draw() {
		System.out.println("Circle points are A= " + "(" + this.point.getX() + ", B" + this.point.getY() + ")");

	}

	public Point getPoint() {
		return point;
	}
	
//	@Required
	@Autowired
	@Qualifier("circleQualifer")
	public void setPoint(Point point) {
		this.point = point;
	}

}
