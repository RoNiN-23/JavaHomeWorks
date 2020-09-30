package ru.mirea.ikbo1319.practical_7;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList <Furniture> chairs = new ArrayList<Furniture>();
    ArrayList <Furniture> wardrobes = new ArrayList<Furniture>();
    ArrayList <Furniture> tables = new ArrayList<Furniture>();
    ArrayList <Furniture> sofas = new ArrayList<Furniture>();

    public void AddWardrobe(Furniture furniture){
        wardrobes.add(furniture);
    }
    public void AddTable(Furniture furniture){
        tables.add(furniture);
    }
    public void AddChair(Furniture furniture){
        chairs.add(furniture);
    }
    public void AddSofa(Furniture furniture){
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

    public void Show(){
        System.out.println(wardrobes);
        System.out.println(tables);
        System.out.println(chairs);
        System.out.println(sofas);

    }
}
