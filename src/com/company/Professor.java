package com.company;

import java.util.ArrayList;

public class Professor extends Person {
    private int experience;
    public Professor(String firstName, String lastName, String sex, String birthDate, int age, int experience) {
        super(firstName, lastName, sex, birthDate, age);
        this.experience = experience;
    }
    public int getExperience() {

        return experience;
    }
    public void setExperience(int experience) {

        this.experience = experience;
    }
}
