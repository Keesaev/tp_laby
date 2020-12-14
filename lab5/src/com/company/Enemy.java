package com.company;

import java.util.Random;

public class Enemy extends Person{
    public Enemy(String name, int healthPoints){
        super(name, healthPoints);
    }

    @Override
    public boolean checkNumber(int a, Person p) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;

        if(randomNumber == a){
            p.setHealthPoints(p.getHealthPoints() - 10);
            System.out.println("Враг попал в вас! У " + p.getName() +
                    " осталось " + p.getHealthPoints() + " жизней!");
            return true;
        }
        else
            System.out.println("Враг не угадал число");
        return false;
    }
}
