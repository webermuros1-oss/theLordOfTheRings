package org.example;


public class FarmerHobbit extends Hobbit {
    private int harvest;

    public FarmerHobbit(String name, int age, String weapon, int health,
                        String specialSkill, int harvest) {
        super(name, age, weapon, health, specialSkill);
        this.harvest = harvest;
    }

    public int getHarvest() {
        return harvest;
    }
    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    @Override
    public void printDetails() {
        System.out.println("Farmer hobbit: " + getName() +
                ", skill: " + getSpecialSkill() +
                ", harvest: " + harvest +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}
