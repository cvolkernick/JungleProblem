package com.example.admin.jungleproblem.model;

public class Monkey extends Animal {

    protected static int population = 0;

    public Monkey() {
        population++;
    }
}
