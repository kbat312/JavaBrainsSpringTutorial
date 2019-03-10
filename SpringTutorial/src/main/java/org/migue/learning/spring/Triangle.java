/**
 * 
 */
package org.migue.learning.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author karan
 *
 */
public class Triangle implements ApplicationContextAware, BeanNameAware, Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> pointList;

	@SuppressWarnings("unused")
    private ApplicationContext appContext;
	
	@Override
	public void draw() {
		System.out.println("Point A = " + "(" + this.pointA.getX() + "," + this.pointA.getY() + ")");
		System.out.println("Point B = " + "(" + this.pointB.getX() + "," + this.pointB.getY() + ")");
		System.out.println("Point C = " + "(" + this.pointC.getX() + "," + this.pointC.getY() + ")");
	}


	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}


	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}


	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}


	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public List<Point> getPointList()
    {
        return pointList;
    }


    public void setPointList(List<Point> pointList)
    {
        this.pointList = pointList;
    }


    public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
			this.appContext  = arg0;
			System.out.println("Application context is: " + arg0);
	}


	public void setBeanName(String arg0) {
		System.out.println("Bean name is: " + arg0);
		
	}


	public void myInit() {
		System.out.println("My init method called for the Triangle");
	}
	
	public void myFinish() {
		System.out.println("My finish method called for the Triangle");
	}
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Initializing beans init method called to bean Triangle");
//		
//	}
//
//
//	public void destroy() throws Exception {
//		System.out.println("Disposable beans destroyment called for the Triangle");
//		
//	}
}
