package com.example.admin.jungleproblem.model.animals;

import android.util.Log;

import com.example.admin.jungleproblem.model.food.Food;

import static android.content.ContentValues.TAG;

public abstract class Animal {

    private int energyLevel;

    public int getEnergyLevel() {
        return energyLevel;
    }

    protected void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void makeSound() {
        setEnergyLevel(energyLevel - 3);
    }

    public void eat(Food food) {
        setEnergyLevel(energyLevel + 5);
    }

    public void sleep() {
        setEnergyLevel(energyLevel + 10);
    }

    @Override
    public String toString() {
        return "Energy level is " + energyLevel;
    }
}