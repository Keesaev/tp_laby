package com.company;

public class ThirdThread extends Thread{
    public ThirdThread(int number){
        m_number = number;
    }
    public int m_number;
    public void run(){
        if(m_number % 2 != 0)
            System.out.println(Math.pow(m_number, 3));
    }
}
