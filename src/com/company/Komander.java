package com.company;

public class Komander extends Solder{
    private String[] subordinatesName = new String[3];
    private String[] subordinatesRank = new String[3];


    public Komander(String name, int age, String rank, int stage, String boss, String[] subordinatesName, String[] subordinatesRank) {
        super(name, age, rank, stage, boss);
        this.subordinatesName = subordinatesName;
        this.subordinatesRank = subordinatesRank;
    }

    public String[] getSubordinatesName() {
        return subordinatesName;
    }

    public void setSubordinatesName(String[] subordinatesName) {
        this.subordinatesName = subordinatesName;
    }

    public String[] getSubordinatesRank() {
        return subordinatesRank;
    }

    public void setSubordinatesRank(String[] subordinatesRank) {
        this.subordinatesRank = subordinatesRank;
    }
}
