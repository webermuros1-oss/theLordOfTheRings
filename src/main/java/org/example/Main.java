package org.example;

public class Main {
    public static void main(String[] args) {


        Knight boromir = new Knight("Boromir", 40, "Sword", 100, "Gondor", 90);
        boromir.setPhrase("One does not simply walk into Mordor.");

        Ranger faramir = new Ranger("Faramir", 35, "Bow", 95, "Gondor", 85);
        faramir.setPhrase("I do not think we should be too hasty.");

        Knight theoden = new Knight("Theoden", 60, "Spear", 110, "Rohan", 80);
        theoden.setPhrase("Ride now! Ride to ruin and the world's ending!");


        HighElf elrond = new HighElf("Elrond", 3000, "Elven sword", 120, "Light", 100);
        elrond.setPhrase("Even the smallest person can change the course of the future.");

        WoodElf legolas = new WoodElf("Legolas", 2931, "Elven bow", 110, "Nature", 95);
        legolas.setPhrase("A red sun rises. Blood has been spilled this night.");

        WoodElf tauriel = new WoodElf("Tauriel", 600, "Daggers", 105, "Forest", 90);
        tauriel.setPhrase("If this is love, I do not want it.");


        DwarfWarrior gimli = new DwarfWarrior("Gimli", 139, "Axe", 115, "Durin", 90);
        gimli.setPhrase("Nobody tosses a Dwarf!");

        DwarfMiner balin = new DwarfMiner("Balin", 200, "Axe", 100, "Khazad", 95);
        balin.setPhrase("We are going on an adventure.");

        DwarfWarrior dwalin = new DwarfWarrior("Dwalin", 195, "Mace", 110, "Khazad", 88);
        dwalin.setPhrase("I would not trust one of them further than I could throw one.");


        AdventurousHobbit frodo = new AdventurousHobbit("Frodo", 50, "Sting", 80, "Ring bearer", 100);
        frodo.setPhrase("I will take the Ring, though I do not know the way.");

        AdventurousHobbit sam = new AdventurousHobbit("Sam", 38, "Knife", 85, "Loyalty", 95);
        sam.setPhrase("I can not carry it for you, but I can carry you.");

        FarmerHobbit bilbo = new FarmerHobbit("Bilbo", 111, "Sting", 75, "Storytelling", 70);
        bilbo.setPhrase("I am going on an adventure!");


        UrukHai lurtz = new UrukHai("Lurtz", 30, "Bow", 90, 85, true);
        lurtz.setPhrase("Find the Halflings!");

        OrcShaman gorbag = new OrcShaman("Gorbag", 45, "Staff", 70, 60, 80);
        gorbag.setPhrase("Looks like meat is back on the menu, boys!");

        OrcShaman shagrat = new OrcShaman("Shagrat", 40, "Knife", 75, 65, 70);
        shagrat.setPhrase("This prisoner goes to Barad-dur.");


        Character[] characters = new Character[] {
                boromir, faramir, theoden,
                elrond, legolas, tauriel,
                gimli, balin, dwalin,
                frodo, sam, bilbo,
                lurtz, gorbag, shagrat
        };

        for (Character c : characters) {
            c.printDetails();
        }
    }
}