package com.example.demo;

import com.example.demo.mindreader.Thinker;
import com.example.demo.performer.PerformanceException;
import com.example.demo.performer.Performer;
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