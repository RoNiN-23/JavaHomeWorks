package ru.mirea.ikbo1319.practical_7;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> chairs = new ArrayList<Furniture>();
    ArrayList<Furniture> wardrobes = new ArrayList<Furniture>();
    ArrayList<Furniture> tables = new ArrayList<Furniture>();
    ArrayList<Furniture> sofas = new ArrayList<Furniture>();

    public void AddWardrobe(Furniture furniture) {
        wardrobes.add(furniture);
    }

    public void AddTable(Furniture furniture) {
        tables.add(furniture);
    }

    public void AddChair(Furniture furniture) {
        chairs.add(furniture);
    }

    public void AddSofa(Furniture furniture) {
        sofas.add(furniture);
    }

    public ArrayList<Furniture> getChairs() {
        return chairs;
    }

    public ArrayList<Furniture> getWardrobes() {
        return wardrobes;
    }

    public ArrayList<Furniture> getTables() {
        return tables;
    }

    public ArrayList<Furniture> getSofas() {
        return sofas;
    }

    public void Show() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Модель №" + (i + 1) + " : " + wardrobes.get(i));
        }
        System.out.println("============================================================================================================================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Модель №" + (i + 1) + " : " + tables.get(i));
        }
        System.out.println("============================================================================================================================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Модель №" + (i + 1) + " : " + chairs.get(i));
        }
        System.out.println("============================================================================================================================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Модель №" + (i + 1) + " : " + sofas.get(i));
        }
        System.out.println("============================================================================================================================");

    }
}
