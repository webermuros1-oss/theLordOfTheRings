package org.example;

public class Knight extends Human {
    private int honorLevel;

    public Knight(String name, int age, String weapon, int health,
                  String kingdom, int honorLevel) {
        super(name, age, weapon, health, kingdom);
        this.honorLevel = honorLevel;
    }

    public int getHonorLevel() {
        return honorLevel;
    }
    public void setHonorLevel(int honorLevel) {
        this.honorLevel = honorLevel;
    }

    @Override
    public void printDetails() {
        System.out.println("Human knight: " + getName() +
                ", kingdom: " + getKingdom() +
                ", honor: " + honorLevel +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}
