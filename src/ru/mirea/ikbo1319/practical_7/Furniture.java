package ru.mirea.ikbo1319.practical_7;

public abstract class Furniture{
    private String color, material;
    private double height, width, lonG;

    public Furniture(String color, String material, double height, double width, double lonG) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.lonG = lonG;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
