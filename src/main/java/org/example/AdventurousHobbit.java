package org.example;

public class AdventurousHobbit extends Hobbit {
    private int courage;

    public AdventurousHobbit(String name, int age, String weapon, int health,
                             String specialSkill, int courage) {
        super(name, age, weapon, health, specialSkill);
        this.courage = courage;
    }

    public int getCourage() {
        return courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void printDetails() {
        System.out.println("Adventurous hobbit: " + getName() +
                ", skill: " + getSpecialSkill() +
                ", courage: " + courage +
                ", weapon: " + getWeapon() +
                ", health: " + getHealth());
    }
}
