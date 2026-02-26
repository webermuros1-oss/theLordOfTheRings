package org.example;

public class Dwarf extends Character {
    private String clan;

    public Dwarf(String name, int age, String weapon, int health, String clan) {
        super(name, age, weapon, health);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }
    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public void printDetails() {
        System.out.println("Dwarf: " + getName() +
                ", clan: " + clan +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}
