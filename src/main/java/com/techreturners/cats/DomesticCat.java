package com.techreturners.cats;

public class DomesticCat implements Cat {

    private boolean sleep = false;
    private final String setting = "domestic";
    private final int AverageHeight = 23;

    @Override
    public String eat(){
        return "Purrrrrrr";
    }

    @Override
    public boolean isAsleep() {
        //System.out.println("Cat should be awake by default");
        return sleep;
    }

    @Override
    public void goToSleep() {
        sleep = true;
        //System.out.println("Cat should be snoozing");
    }
        @Override
    public void wakeUp(){
        sleep = false;
        //System.out.println("Cat should be awake now");
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
