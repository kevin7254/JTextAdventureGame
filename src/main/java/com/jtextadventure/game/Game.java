package com.jtextadventure.game;

import com.jtextadventure.game.entities.Player;

import java.util.Scanner;

public class Game {

    Player player;
    Scanner sc;

    public Game(Player player, String playerName) {

        this.player = player;
        this.sc = new Scanner(System.in);

    }




    public void newGameInit(Player player) {

        player.setName(sc.nextLine());
    }


    public static void main(String[] args) {

    }
}
