package com.jtextadventure.game;

import com.jtextadventure.game.entities.Entity;
import com.jtextadventure.game.entities.Player;

import java.util.Scanner;

public class Game {

    Player player;
    Scanner sc;
    private static boolean running = true;

    public Game() {

        this.player = Player.getInstance();
        this.sc = new Scanner(System.in);

        switch (player.playerType()) {
            case "new":
                newGameInit(player);
                running = true;
                player.getStats();
                break;

            case "old":
                //TODO if already played - load save etc.
                break;

            default:
                break;
        }

    }


    public void newGameInit(Player player) { // BARA om det är first time playing. TODO fixa till JSON sen
        player.setName("Default");
        player.setArmor(10);
        player.setDexterity(10);
        player.setHealth(100);
        player.setIntelligence(10);
        player.setLevel(1);
        player.setStrength(10);
    }

    public static boolean isRunning() { //TODO: Maybe not static?
        return running;
    }


}
