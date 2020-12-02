package com.springinaction.springidol.contestant;

public class GraciousContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("It seems working!");
    }
}
