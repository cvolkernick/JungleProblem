package com.example.admin.jungleproblem.model;

import android.util.Log;

import com.example.admin.jungleproblem.model.animals.Animal;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

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

    public void soundOff() {
        for (Animal a : animals) {
            a.makeSound();
            Log.d(TAG, "soundOff: " + a.toString());
        }
    }
}
