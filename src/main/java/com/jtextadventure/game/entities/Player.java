package com.jtextadventure.game.entities;

import com.jtextadventure.game.Ui;
import org.json.simple.*;

import java.io.FileWriter;
import java.io.IOException;

public class Player extends Entity {


    public Player() {

    }

    public void setName(String nextLine) {
    }

    public String playerType() {
        return "new"; //TODO fixa så new = om man inte spelat innan osv. aka kolla save osv.
    }

    private static Player player;

    public static Player getInstance() {
        player = new Player();

        JSONObject playerDetails = new JSONObject();

        try (FileWriter file = new FileWriter("json/data/items.json")) {
            file.write(playerDetails.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO: init player here with json, setters etc

        return player;
    }


    public void getStats() {

        String message = "\nPlayer name: " + getName();
        message += "\nLevel: " + getLevel();
        message += "\nGold: " + getGold();
        message += "\nArmor: " + getArmor();
        message += "\nDexerity: " + getDexterity();
        message += "\nHealth/Max: " + getHealth() + "/" + getHealthMax();
        message += "\nDamage/Strength: " + getDamage() + "/" + getStrength();
        message += "\nCrit chance: " + getCritChange();
        message += "\nIntelligence: " + getIntelligence();
        Ui.printOnScreen(message);

    }
}
