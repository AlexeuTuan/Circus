package com.springinaction.springidol;

import com.springinaction.springidol.mindreader.Volunteer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurator.class);
        Volunteer volunteer = (Volunteer) context.getBean("volunteer");
        volunteer.thinkOfSomething("thoughts");
    }
}