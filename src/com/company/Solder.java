package com.company;

public class Solder extends Human {
    private String rank;
    private String boss;
    private int stage = 0;

    public Solder(String name, int age, String rank, int stage) {
        super(name, age);
        this.rank = rank;
        this.stage = stage;;
    }

    public Solder(String name, int age, String rank, int stage, String boss) {
        super(name, age);
        this.rank = rank;
        this.stage = stage;
        this.boss = boss;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void SayRank(Solder solder){
        System.out.println("Name " + solder.getName() + " rank: " + solder.rank);
    }

    @Override
    public void Report() {
        System.out.println("Name " + this.getName() + " subordinate commander: " + boss);
    }
}
