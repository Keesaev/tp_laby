package com.company;

public class SecondThread extends Thread {
    public SecondThread(int number){
        m_number = number;
    }
    public int m_number;
    public void run(){
        if(m_number % 2 == 0)
            System.out.println(m_number * m_number);
    }
}
