/**
 * 
 */
package org.migue.learning.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author karan
 */
public class DrawingApp
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        // Triangle triangle = new Triangle();
        // BeanFactory beanFactory = new XmlBeanFactory(new
        // FileSystemResource("spring.xml"));

        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            // context.registerShutdownHook();
            Triangle triangle = (Triangle) context.getBean("triangle1");
            System.out.println("CALL TO DRAW METHOD.....");
            triangle.draw();

        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
