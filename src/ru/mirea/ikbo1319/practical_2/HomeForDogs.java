package ru.mirea.ikbo1319.practical_2;

import java.util.ArrayList;

public class HomeForDogs {
    ArrayList <Dog> dogs = new ArrayList <Dog>();

    public void dogAdd(String name, int age){
        dogs.add(new Dog(name, age));
    }
    public void dogsShow(){
        System.out.println(dogs);

    }
}
