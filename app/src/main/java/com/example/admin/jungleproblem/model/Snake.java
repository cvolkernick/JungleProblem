package com.example.admin.jungleproblem.model;

public class Snake extends Animal {

    protected static int population = 0;

    public Snake() {
        population++;
    }
}
