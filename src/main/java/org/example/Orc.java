package org.example;



public class Orc extends Character {
    private int strength;

    public Orc(String name, int age, String weapon, int health, int strength) {
        super(name, age, weapon, health);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void printDetails() {
        System.out.println("Orc: " + getName() +
                ", strength: " + strength +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}

