package com.company;

import jdk.jshell.spi.ExecutionControl;

public abstract class Person {
    private String m_name = "NONE";
    private int m_healthPoints = 100;

    public Person(){}
    public Person(String name, int healthPoints){
        m_name = name;
        m_healthPoints = healthPoints;
    }

    public abstract boolean checkNumber(int a, Person p);

    public int getHealthPoints(){ return m_healthPoints; }
    public String getName(){ return m_name; }
    public void setHealthPoints(int a){ m_healthPoints = a; }
    public void setName(String a) { m_name = a; }
}
