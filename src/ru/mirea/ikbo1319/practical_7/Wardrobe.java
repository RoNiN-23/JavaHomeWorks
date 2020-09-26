package ru.mirea.ikbo1319.practical_7;

public class Wardrobe extends Furniture{
    private int numOfShelves, numOfDoors;

    public Wardrobe(String color, String material, double height, double width, double lonG, int numOfShelves, int numOfDoors) {
        super(color, material, height, width, lonG);
        this.numOfShelves = numOfShelves;
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfShelves() {
        return numOfShelves;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfShelves(int numOfShelves) {
        this.numOfShelves = numOfShelves;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}
