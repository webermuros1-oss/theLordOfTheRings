package org.example;


public class Hobbit extends Character {
    private String specialSkill;

    public Hobbit(String name, int age, String weapon, int health, String specialSkill) {
        super(name, age, weapon, health);
        this.specialSkill = specialSkill;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }
    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    @Override
    public void printDetails() {
        System.out.println("Hobbit: " + getName() +
                ", skill: " + specialSkill +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}

