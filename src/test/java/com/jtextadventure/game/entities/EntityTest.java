package com.jtextadventure.game.entities;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {

    @Test
    void test() {
        final Entity entity = new Entity();
        entity.setArmor(10);
        assertEquals(entity.getArmor(), 10);
        entity.setDexterity(25);
        assertEquals(entity.getDexterity(),25);
        entity.setGold(100);
        assertEquals(entity.getGold(), 100);
        entity.setHealth(40);
        assertEquals(entity.getHealth(),40);
        entity.setHealthMax(40);
        assertEquals(entity.getHealthMax(),40);
        entity.setIntelligence(20);
        assertEquals(entity.getIntelligence(),20);
        entity.setLevel(5);
        assertEquals(entity.getLevel(),5);
        entity.setStrength(3);
        assertEquals(entity.getStrength(),3);
        entity.setName("Default");
    }
}