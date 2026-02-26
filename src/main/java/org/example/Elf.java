package org.example;
public class Elf extends Character {
    private String magicType;

    public Elf(String name, int age, String weapon, int health, String magicType) {
        super(name, age, weapon, health);
        this.magicType = magicType;
    }

    public String getMagicType() { return magicType; }
    public void setMagicType(String magicType) { this.magicType = magicType; }

    @Override
    public void printDetails() {
        System.out.println("Elf: " + getName() +
                ", magic: " + magicType +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}