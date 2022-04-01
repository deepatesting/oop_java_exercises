package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {

    private final String[] randomEatMsg = {"Purrrrrrr", "It will do I suppose"};

    public DomesticCat(String setting, int averageHeight, String eat) {
        super(setting, averageHeight, eat);
    }

    @Override
    public String eat(){
        Random r = new Random();
        int randomNumber = r.nextInt(randomEatMsg.length);
        System.out.println(randomEatMsg[randomNumber]);
        return randomEatMsg[randomNumber];
    }

}
