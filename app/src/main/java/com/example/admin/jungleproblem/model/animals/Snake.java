package com.example.admin.jungleproblem.model.animals;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Snake extends Animal {

    protected static int population = 0;

    public Snake() {
        population++;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        Log.d(TAG, "makeSound: *hiss*");
    }
}
