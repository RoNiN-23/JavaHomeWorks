package ru.mirea.ikbo1319.practical_7;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList <Chair> chairs = new ArrayList<Chair>();
    ArrayList <Wardrobe> wardrobes = new ArrayList<Wardrobe>();
    ArrayList <Table> tables = new ArrayList<Table>();
    ArrayList <Sofa> sofas = new ArrayList<Sofa>();

    public void AddWordrobe(String color, String material, double height, double width, double lonG, int numOfShelves, int numOfDoors){
        wardrobes.add(new Wardrobe(color, material, height, width, lonG, numOfShelves, numOfDoors));
    }
    public void AddTable(String color, String material, double height, double width, double lonG, int numOfLegs){
        tables.add(new Table(color, material, height, width, lonG, numOfLegs));
    }
    public void AddChair(String color, String material, double height, double width, double lonG, int numOfLegs){
        chairs.add(new Chair(color, material, height, width, lonG, numOfLegs));
    }
    public void AddSofa(String color, String material, double height, double width, double lonG, boolean fold){
        sofas.add(new Sofa(color, material, height, width, lonG, fold));
    }

    public void Show(){
        System.out.println(wardrobes);
        System.out.println(tables);
        System.out.println(chairs);
        System.out.println(sofas);

    }
}
