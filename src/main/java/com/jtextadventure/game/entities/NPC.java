package com.jtextadventure.game.entities;

import java.util.ArrayList;
import java.util.List;

public class NPC extends Entity {

    private int xpGain;
    private String id;
    private List<String> allies;
    private List<String> enemies;


    public NPC() {
        this.allies = new ArrayList<String>();
        this.enemies = new ArrayList<String>();
    }

    public NPC(String entityId) {
        this.allies = new ArrayList<String>();
        this.enemies = new ArrayList<String>();
        this.id = entityId;
    }


    public int getXpGain() {
        return xpGain;
    }

    public void setXpGain(int xpGain) {
        this.xpGain = xpGain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAllies() {
        return allies;
    }

    public void setAllies(List<String> allies) {
        this.allies = allies;
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<String> enemies) {
        this.enemies = enemies;
    }
}
