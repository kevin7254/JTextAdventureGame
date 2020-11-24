package com.jtextadventure.game;

import java.util.Scanner;

/**
 * Class for User Interface. This class is used to make it simpler to switch to GUI later on.
 */
public class Ui {

    private static final Scanner scanner = new Scanner(System.in);

    private Ui() {
    }

    public static void clear() { //clears the console window when called.
        System.out.println("\033[H\033[2J"); //todo skiten funkar inte xd
        System.out.flush();
    }

    public static void printOnScreen(String text) {
        System.out.println(text + "\n");
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static void pause() {
        try {
            Scanner pauseScr = new Scanner(System.in);
            String s = pauseScr.nextLine();
            printOnScreen(s);
        } catch (Exception ignored) {

        }
    }

}
