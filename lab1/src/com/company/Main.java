package com.company;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        Scanner in = new Scanner(System.in);
        in.nextLine();

        firstThread.interrupt();
    }

}