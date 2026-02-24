package org.example;

package lotr;

public class Human extends Character {
    private String kingdom;

    public Human(String name, int age, String weapon, int health, String kingdom) {
        super(name, age, weapon, health);
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return kingdom;
    }
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    @Override
    public void printDetails() {
        System.out.println("Human: " + getName() +
                ", kingdom: " + kingdom +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}
