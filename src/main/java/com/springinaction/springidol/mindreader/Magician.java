package com.springinaction.springidol.mindreader;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Magician implements MindReader {
    private String thoughts;
    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* com.springinaction.springidol.mindreader.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
        // Leave it empty
    }

    @Before("thinking(thoughts)") // Передача параметра в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts : "
                + thoughts);
        this.thoughts = thoughts;
    }
    public String getThoughts() {
        return thoughts;
    }
}