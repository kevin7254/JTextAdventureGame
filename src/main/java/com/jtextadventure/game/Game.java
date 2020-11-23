package com.jtextadventure.game;

import com.jtextadventure.game.entities.Entity;
import com.jtextadventure.game.entities.Player;

import java.util.Scanner;

public class Game {

    Player player;
    Scanner sc;

    public Game(Player player, String playerType) {

        this.player = player;
        this.sc = new Scanner(System.in);

        switch (playerType) {
            case "new":
                newGameInit(player);
                break;

            case "old":
                //TODO if already played - load save etc.
                break;

            default:
                break;
        }

    }




    public void newGameInit(Player player) {

        player.setName(sc.nextLine());
    }


}
