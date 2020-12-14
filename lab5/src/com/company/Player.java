package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Player extends Person {
    public Player(String name, int healthPoints){
        super(name, healthPoints);
    }

    @Override
    public boolean checkNumber(int a, Person p) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1 до 20:");

        int userNumber = -1;
        try{
            userNumber = in.nextInt();
        }
        catch(Exception ex){
            setHealthPoints(0);
        }
        if(userNumber < 0 || userNumber > 20)
            setHealthPoints(0);
        if(userNumber == a){
            p.setHealthPoints(p.getHealthPoints() - 10);
            System.out.println("Вы угадали, теперь у врага с именем " +
                    p.getName() + " осталось " + p.getHealthPoints() + " жизней!");
            return true;
        }
        else if(userNumber < a)
            System.out.println("Вы не угадали! Число что вы пытаетесь угадать больше");
        else if(userNumber > a)
            System.out.println("Вы не угадали! Число что вы пытаетесь угадать меньше");
        return false;
    }
}
