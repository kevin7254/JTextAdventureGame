package com.jtextadventure.game;

import com.jtextadventure.game.entities.Player;

public class JTextGame {

    public static void main(String[] args) {
        Player player = Player.getInstance();
        new Game(player, "starter"); //TODO move from main this is just so program compiles
    }
}
