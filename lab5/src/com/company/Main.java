package com.company;

import java.util.Random;

public class Main {
    public static Person m_player, m_enemy;
    public static void main(String[] args) {
        m_player = new Player("Костя", 100);
        m_enemy = new Enemy("Дима", 100);

        gameLoop();
    }

    public static void gameLoop(){
        int playerHealthPoints = m_player.getHealthPoints();
        int enemyHealthPoints = m_enemy.getHealthPoints();

        Random rand = new Random();
        int number = rand.nextInt(20) + 1;

        while(playerHealthPoints >= 10 && enemyHealthPoints >= 10){
            boolean didGuess;

            didGuess = m_player.checkNumber(number, m_enemy);
            didGuess |= m_enemy.checkNumber(number, m_player);

            if(didGuess) {
                System.out.println("Предыдущее число - " + number);
                System.out.println("Выбрано новое число!");
                number = rand.nextInt(20) + 1;
            }

            playerHealthPoints = m_player.getHealthPoints();
            enemyHealthPoints = m_enemy.getHealthPoints();
        }

        String result = "Победитель - ";
        if(playerHealthPoints < 10)
            result += m_enemy.getName();
        else
            result += m_player.getName();
        System.out.println(result);
    }
}
