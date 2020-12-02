package com.springinaction.springidol;

import com.springinaction.springidol.mindreader.Thinker;
import com.springinaction.springidol.performer.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class Main {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext aspectContext = new ClassPathXmlApplicationContext("aspect_config.xml");

        Thinker thinker = (Thinker) aspectContext.getBean("thinker");
        thinker.thinkOfSomething("112");
    }

}