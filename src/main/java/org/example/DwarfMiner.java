package org.example;

public class DwarfMiner extends Dwarf {
    private int miningSkill;

    public DwarfMiner(String name, int age, String weapon, int health,
                      String clan, int miningSkill) {
        super(name, age, weapon, health, clan);
        this.miningSkill = miningSkill;
    }

    public int getMiningSkill() {
        return miningSkill;
    }
    public void setMiningSkill(int miningSkill) {
        this.miningSkill = miningSkill;
    }

    @Override
    public void printDetails() {
        System.out.println("Dwarf miner: " + getName() +
                ", clan: " + getClan() +
                ", mining: " + miningSkill +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}