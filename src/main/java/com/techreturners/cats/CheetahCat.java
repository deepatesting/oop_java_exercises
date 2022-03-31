package com.techreturners.cats;


public class CheetahCat implements Cat{

    private boolean sleep = false;
    private final String setting = "wild";
    private final int AverageHeight = 1100;

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public void goToSleep() {
        sleep = true;
        //System.out.println("Cat should be snoozing");
    }

    @Override
    public void wakeUp() {
        sleep = false;
        System.out.println("Cat should be awake now");
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return AverageHeight;
    }
}
