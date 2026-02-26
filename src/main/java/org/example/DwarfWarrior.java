package org.example;


public class DwarfWarrior extends Dwarf {
    private int armorLevel;

    public DwarfWarrior(String name, int age, String weapon, int health,
                        String clan, int armorLevel) {
        super(name, age, weapon, health, clan);
        this.armorLevel = armorLevel;
    }

    public int getArmorLevel() {
        return armorLevel;
    }
    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    @Override
    public void printDetails() {
        System.out.println("Dwarf warrior: " + getName() +
                ", clan: " + getClan() +
                ", armor: " + armorLevel +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}