package com.company;

public class General extends Solder {
    private String[] subordinatesName = new String[2];
    private String[] subordinatesRank = new String[2];

    public General(String name, int age, String rank, int stage, String[] subordinatesName, String[] subordinatesRank) {
        super(name, age, rank, stage);
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

    @Override
    public void Report() {
        System.out.println("Name " + this.getName());
    }
}
