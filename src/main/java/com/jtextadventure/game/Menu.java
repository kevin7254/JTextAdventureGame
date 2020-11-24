package com.jtextadventure.game;

public class Menu {

    private Menu() {
    }

    public static void init() {
        while (Game.isRunning()) {

            Ui.clear();

            Ui.printOnScreen("WELCOME");

            String message = "\n _______________________________________________";
            message += "\n|          WELCOME TO J-TEXT ADVENTURE          |";
            message += "\n|       A Text Based Dungeon Crawler Game       |";
            message += "\n|***********************************************|";
            message += "\n|                                               |";
            message += "\n|      To start, choose your number below       |";
            message += "\n|                 and press enter.              |";
            message += "\n|                                               |";
            message += "\n|  1) Start 'New Game'    (WILL ERASE SAVE!!!!) |";
            message += "\n|  2) Load Save                                 |";
            message += "\n|  3) Exit                                      |";
            message += "\n|                                               |";
            message += "\n|_______________________________________________|";

            Ui.printOnScreen(message);


            switch (Ui.getInt()) {
                case 1: // "new game"
                    Ui.clear();
                    new Game();
                    break;

                case 2: // "load game"
                    //TODO load from JSON
                    break;

                default:
                    break;
            }


        }
    }

}
