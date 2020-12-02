package com.springinaction.springidol;

import com.springinaction.springidol.audience.Audience;
import com.springinaction.springidol.performer.PerformanceException;
import com.springinaction.springidol.performer.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext aspectContext = new ClassPathXmlApplicationContext("aspect_config.xml");

        Performer performer = (Performer) aspectContext.getBean("instrumentalist");
        performer.perform();
    }

}