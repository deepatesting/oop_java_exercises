package com.techreturners.cats;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CatTest {

    private CatInterface domesticCat;
    private CatInterface lionCat;
    private CatInterface cheetahCat;
    private final String[] testMsg = {"Purrrrrrr", "It will do I suppose"};


    @Before
    public void setup() {
        domesticCat = new DomesticCat("domestic", 23, "Purrrrrrr");
        lionCat = new LionCat("wild", 1100, "Roar!!!!");
        cheetahCat = new CheetahCat("wild", 1100, "Zzzzzzz");

    }

    @Test
    public void checkCatIsAwake() {
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakeup() {
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        assertTrue(Arrays.asList(testMsg).contains(domesticCat.eat()));
    }

}
