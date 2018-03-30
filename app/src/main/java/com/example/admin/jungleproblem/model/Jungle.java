package com.example.admin.jungleproblem.model;

import java.util.ArrayList;
import java.util.List;

public class Jungle {

    private List<Animal> animals;

    public Jungle() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
