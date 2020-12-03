package com.springinaction.springidol.audience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Pointcut("execution(* com.springinaction.springidol.performer.Performer.perform(..))")
    public void performance() {
        // Leave it empty
    }
//    @Before("performance()")
//    public void takeSeats() { // Перед выступлением
//        System.out.println("The audience is taking their seats.");
//    }
//
//    @Before("performance()") // Перед выступлением
//    public void turnOffCellPhones() {
//        System.out.println("The audience is turning off their cellphones");
//    }
//
//    @AfterReturning("performance()") // После успешного выступления
//    public void applaud() {
//        System.out.println("CLAP CLAP CLAP CLAP CLAP");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund() { // После неудачного выступления
//        System.out.println("Boo! We want our money back!");
//    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            joinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}