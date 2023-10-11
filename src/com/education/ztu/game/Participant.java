package com.education.ztu.game;

public abstract class Participant implements Cloneable, Comparable<Participant>{
    public String name;
    public int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Participant other) {
        return this.name.compareTo(other.name);
    }
}