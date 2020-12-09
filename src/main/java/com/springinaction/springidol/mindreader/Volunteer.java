package com.springinaction.springidol.mindreader;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Volunteer implements Thinker {

    @Value("Example Thought")
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

}