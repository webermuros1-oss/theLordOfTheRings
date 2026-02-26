package org.example;


public class OrcShaman extends Orc {
    private int darkMagicPower;

    public OrcShaman(String name, int age, String weapon, int health,
                     int strength, int darkMagicPower) {
        super(name, age, weapon, health, strength);
        this.darkMagicPower = darkMagicPower;
    }

    public int getDarkMagicPower() {
        return darkMagicPower;
    }
    public void setDarkMagicPower(int darkMagicPower) {
        this.darkMagicPower = darkMagicPower;
    }

    @Override
    public void printDetails() {
        System.out.println("Orc shaman: " + getName() +
                ", strength: " + getStrength() +
                ", dark magic: " + darkMagicPower +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}
