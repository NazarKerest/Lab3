package com.education.ztu.game;

import java.util.Objects;

public class Schoolar extends Participant implements League, Cloneable {
    public Schoolar(String name, int age) {
        super(name, age);
    }

    @Override
    public String getLeague() {
        return "Schoolar";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Schoolar schoolar = (Schoolar) obj;
        return age == schoolar.age && Objects.equals(name, schoolar.name);
    }

    @Override
    public String toString() {
        return "Schoolar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

