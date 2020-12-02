package com.springinaction.springidol.audience;


import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.springidol.performer.Performer.perform(..))")
    public void performance() {
    }


    @Before("performance()")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    @Before("performance()") // Перед выступлением
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    @AfterReturning("performance()") // После успешного выступления
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    @AfterThrowing("performance()")
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }
}