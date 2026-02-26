package org.example;

public class Ranger extends Human {
    private int trackingSkill;

    public Ranger(String name, int age, String weapon, int health,
                  String kingdom, int trackingSkill) {
        super(name, age, weapon, health, kingdom);
        this.trackingSkill = trackingSkill;
    }

    public int getTrackingSkill() {
        return trackingSkill;
    }
    public void setTrackingSkill(int trackingSkill) {
        this.trackingSkill = trackingSkill;
    }

    @Override
    public void printDetails() {
        System.out.println("Human ranger: " + getName() +
                ", kingdom: " + getKingdom() +
                ", tracking: " + trackingSkill +
                ", weapon: " + getWeapon() +
                ", phrase: " + getPhrase() +
                ", health: " + getHealth());
    }
}
