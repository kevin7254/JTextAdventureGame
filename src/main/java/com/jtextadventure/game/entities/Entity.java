package com.jtextadventure.game.entities;

public class Entity {

    private int health;
    private int healthMax;
    private String name;
    private int level;
    //Stats
    private int intelligence; //affects things such as trading etc.
    private int dexterity; // affects defense
    private int armor; // affects defense
    private int strength; // affects attack
    private int gold;



    public Entity() {
        this(100,100,"Name",1,0);
    }

    public Entity (int health, int healthMax, String name, int level, int gold) {

        this.health = health;
        this.healthMax = healthMax;
        this.name = name;
        this.level = level;
        this.gold = gold;

    }


    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > healthMax) {
            health = healthMax;
        }
        this.health = health;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
