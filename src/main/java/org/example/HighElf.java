package org.example;

public class HighElf extends Elf {
    private int wisdom;

    public HighElf(String name, int age, String weapon, int health,
                   String magicType, int wisdom) {
        super(name, age, weapon, health, magicType);
        this.wisdom = wisdom;
    }

    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    @Override
    public void printDetails() {
        System.out.println("High elf: " + getName() +
                ", magic: " + getMagicType() +
                ", wisdom: " + wisdom +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());

    }

}