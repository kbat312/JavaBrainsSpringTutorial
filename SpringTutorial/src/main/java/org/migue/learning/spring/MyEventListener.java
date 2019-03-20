package org.migue.learning.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener
{

    @Override
    public void onApplicationEvent(ApplicationEvent arg0)
    {
        System.out.println("Event is :- "+arg0.toString());
        
        
    }

}
