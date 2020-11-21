package com.company;

public class Main {

    public static void main(String[] args) {
        String[] squad1 = {"Grygor", "Vasyl", "Max"};
        String[] squad2 = {"Anton", "Dmitriy", "Will"};
        String[] squadRank1 = {"common soldier", "common soldier", "common soldier"};
        String[] squadRank2 = {"lieutenant", "common soldier", "common soldier"};
        String[] comanders = {"Jon", "Bob"};
        String[] comandersRank = {"komander", "komander"};

        Solder[] headquarters = {
                new Solder("Grygor", 20, "common soldier", 1, "Jon"),
                new Solder("Vasyl", 18, "common soldier", 2, "Jon"),
                new Solder("Max", 20, "common soldier", 1, "Jon"),
                new Solder("Anton", 25, "lieutenant", 3, "Bob"),
                new Solder("Dmitriy", 22, "common soldier", 1, "Bob"),
                new Solder("Will", 21, "common soldier", 1, "Bob"),
                new Komander("Will", 30, "komander", 5, "Oleg", squad1, squadRank1),
                new Komander("Bob", 33, "komander", 10, "Oleg", squad2, squadRank2),
                new General("Oleg", 40, "general", 15, comanders, comandersRank),
        };
        for(int i=0; i<9; i++){
            headquarters[i].Report();
            headquarters[i].ToFight();
        }
    }
}
