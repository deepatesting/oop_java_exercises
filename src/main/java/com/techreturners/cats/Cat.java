package com.techreturners.cats;

public abstract class Cat implements CatInterface {

    private boolean sleepStatus = false;
    private final String setting;
    private final int averageHeight;
    private final String eat;

    public Cat(String setting, int averageHeight, String eat){
        this.setting = setting;
        this.averageHeight = averageHeight;
        this.eat = eat;
    }

    public String eat() {
        return this.eat;
    }

    public boolean isAsleep() {
        return this.sleepStatus;
    }

    public void goToSleep() {
        sleepStatus = true;
    }

    public void wakeUp(){
        sleepStatus = false;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }
}
