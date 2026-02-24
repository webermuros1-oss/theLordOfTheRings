package org.example;


public class UrukHai extends Orc {
    private boolean sunResistance;

    public UrukHai(String name, int age, String weapon, int health,
                   int strength, boolean sunResistance) {
        super(name, age, weapon, health, strength);
        this.sunResistance = sunResistance;
    }

    public boolean hasSunResistance() {
        return sunResistance;
    }
    public void setSunResistance(boolean sunResistance) {
        this.sunResistance = sunResistance;
    }

    @Override
    public void printDetails() {
        System.out.println("Uruk-hai: " + getName() +
                ", strength: " + getStrength() +
                ", sun resistance: " + sunResistance +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}

