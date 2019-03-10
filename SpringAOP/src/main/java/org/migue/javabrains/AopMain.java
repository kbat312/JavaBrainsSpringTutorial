/**
 * 
 */
package main.java.org.migue.javabrains;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.org.migue.javabrains.service.FactoryService;
import main.java.org.migue.javabrains.service.ShapeService;

/**
 * @author karan
 *
 */


public class AopMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);

		//shapeService.getCircle().setNameAndReturn("my Circle");
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService =(ShapeService)  factoryService.getBean("ShapeService");
		shapeService.getCircle();
		//System.out.println("CIRCLE NAME: " + shapeService.getCircle().getName());
		//System.out.println("TRIANGLE NAME: " + shapeService.getTriangle().getName());

	}

}
