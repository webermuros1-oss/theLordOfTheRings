package org.example;

public class Character {
    private String name;
    private int age;
    private String weapon;
    private int health;

    public Character(String name, int age, String weapon, int health) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.health = health;
    }

    // Getters and setters (encapsulation)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    // Polymorphic method: overridden in subclasses
    public void printDetails() {
        System.out.println("Generic character: " + name +
                ", age: " + age +
                ", weapon: " + weapon +
                ", health: " + health);
    }
}
