package com.company;

public abstract class Human implements CapableOfCombat{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void SayName(Human human){
        System.out.println("Hello, my name is " + human.name);
    }

    @Override
    public void ToFight() {
        System.out.println("WAAAAAGH!!!");
    }
}
