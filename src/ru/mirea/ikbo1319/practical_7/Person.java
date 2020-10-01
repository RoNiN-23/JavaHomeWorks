package ru.mirea.ikbo1319.practical_7;

import java.util.ArrayList;

public class Person extends FurnitureShop {
    ArrayList<Furniture> furnitures = new ArrayList<Furniture>();


    public void AddFurnitures(ArrayList<Furniture> test, int n) {
        furnitures.add(test.get(n));
    }

    public void showPerson() {
        System.out.println(furnitures);
    }
}