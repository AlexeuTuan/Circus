package com.springinaction.springidol.judge;

public aspect JudgeAspect {
    public JudgeAspect() {}
    pointcut performance() : execution(* perform(..));
    after() returning() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }
    // внедряется
    private CriticismEngine criticismEngine;
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }


}