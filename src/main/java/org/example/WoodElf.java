package org.example;

public class WoodElf extends Elf {
    private int forestAffinity;

    public WoodElf(String name, int age, String weapon, int health,
                   String magicType, int forestAffinity) {
        super(name, age, weapon, health, magicType);
        this.forestAffinity = forestAffinity;
    }

    public int getForestAffinity() {
        return forestAffinity;
    }
    public void setForestAffinity(int forestAffinity) {
        this.forestAffinity = forestAffinity;
    }

    @Override
    public void printDetails() {
        System.out.println("Wood elf: " + getName() +
                ", magic: " + getMagicType() +
                ", forest affinity: " + forestAffinity +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}
