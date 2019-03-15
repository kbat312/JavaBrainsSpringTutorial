package org.migue.learning.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	private Point point;

	@Override
	public void draw() {
		System.out.println("Circle points are A= " + "(" + this.point.getX() + ", " + this.point.getY() + ")");

	}

	public Point getPoint() {
		return point;
	}
	
	/*@Required
	@Autowired
	@Qualifier("circleQualifer")*/
	@Resource
	public void setPoint(Point point) {
		this.point = point;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("calling postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("calling preDestroy");
	}
	
}
