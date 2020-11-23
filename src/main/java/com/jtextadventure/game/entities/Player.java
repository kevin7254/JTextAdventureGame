package com.jtextadventure.game.entities;

import org.json.simple.*;

import java.io.FileWriter;
import java.io.IOException;

public class Player extends Entity {



    public Player() {

    }

    public void setName(String nextLine) {

    }

    private static Player player;

    public static Player getInstance() {
        player = new Player();

        JSONObject playerDetails = new JSONObject();// https://howtodoinjava.com/java/library/json-simple-read-write-json-examples/

        try (FileWriter file = new FileWriter("json/data/items.json")) {
            file.write(playerDetails.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO: init player here with json, setters etc

        return player;
    }
}
