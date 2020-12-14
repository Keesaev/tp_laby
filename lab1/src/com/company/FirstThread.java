package com.company;

import java.util.Random;

public class FirstThread extends Thread {
    public static int m_randomNumber;
    public void run(){
        System.out.println("Hello");
        Random rand = new Random();

        try {
            while (true) {
                m_randomNumber = rand.nextInt(5) + 1;
                System.out.print(m_randomNumber + ": ");

                SecondThread sThread = new SecondThread(m_randomNumber);
                ThirdThread tThread = new ThirdThread(m_randomNumber);

                sThread.start();
                tThread.start();

                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex){
            System.out.println("First thread stopped");
        }
    }
}
