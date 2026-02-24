package org.example;



public class Main {
    public static void main(String[] args) {

        Character[] characters = new Character[] {

                new Knight("Boromir", 40, "Sword", 100, "Gondor", 90),
                new Ranger("Faramir", 35, "Bow", 95, "Gondor", 85),
                new Knight("Theoden", 60, "Spear", 110, "Rohan", 80),


                new HighElf("Elrond", 3000, "Elven sword", 120, "Light", 100),
                new WoodElf("Legolas", 2931, "Elven bow", 110, "Nature", 95),
                new WoodElf("Tauriel", 600, "Daggers", 105, "Forest", 90),


                new DwarfWarrior("Gimli", 139, "Axe", 115, "Durin", 90),
                new DwarfMiner("Balin", 200, "Axe", 100, "Khazad", 95),
                new DwarfWarrior("Dwalin", 195, "Mace", 110, "Khazad", 88),


                new AdventurousHobbit("Frodo", 50, "Sting", 80, "Ring bearer", 100),
                new AdventurousHobbit("Sam", 38, "Knife", 85, "Loyalty", 95),
                new FarmerHobbit("Bilbo", 111, "Sting", 75, "Storytelling", 70),


                new UrukHai("Lurtz", 30, "Bow", 90, 85, true),
                new OrcShaman("Gorbag", 45, "Staff", 70, 60, 80),
                new OrcShaman("Shagrat", 40, "Knife", 75, 65, 70)
        };


        for (Character c : characters) {
            c.printDetails();
        }
    }
}

