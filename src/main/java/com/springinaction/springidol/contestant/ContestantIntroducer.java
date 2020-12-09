package com.springinaction.springidol.contestant;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ContestantIntroducer {
    @DeclareParents( // Внедрение интерфейса Contestant
            value = "com.springinaction.springidol.performer.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}