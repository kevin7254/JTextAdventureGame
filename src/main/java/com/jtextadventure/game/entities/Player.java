package com.jtextadventure.game.entities;

import com.jtextadventure.game.items.Item;
import com.jtextadventure.game.monsters.Monster;

public class Player extends Entity {



    public Player() {

    }

    public void attack(String opponentName) {
        Monster monsterOpponent = null;
        NPC npcOpponent = null;
    }

    public boolean hasitem(Item item) {
        return false; //TODO: Item class - check if player has item in inventory.
    }

}
