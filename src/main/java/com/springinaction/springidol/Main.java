package com.springinaction.springidol;

import com.springinaction.springidol.contestant.Contestant;
import com.springinaction.springidol.performer.PerformanceException;
import com.springinaction.springidol.performer.Performer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurator.class);
//        Thinker volunteer = (Thinker) context.getBean("volunteer");
//        volunteer.thinkOfSomething("thoughts");
        Performer performer = (Performer) context.getBean("instrumentalist");
        performer.perform();

        ((Contestant) performer).receiveAward();
    }
}