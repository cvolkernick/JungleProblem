package com.example.admin.jungleproblem.model;

import android.util.Log;

import com.example.admin.jungleproblem.model.animals.Animal;
import com.example.admin.jungleproblem.model.food.Grain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public void randomActivities() {
        Random random = new Random();

        for (Animal a : animals) {
            int actionNumber = random.nextInt(3 - 1) + 1;

            switch (actionNumber) {
                case 1:
                    a.eat(new Grain());
                    break;
                case 2:
                    a.sleep();
                    break;
                case 3:
                    a.makeSound();
                    break;
            }
        }
    }
}
