package ru.mirea.ikbo1319.practical_7;

public abstract class Furniture {
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLonG() {
        return lonG;
    }

    public void setLonG(double lonG) {
        this.lonG = lonG;
    }

    public  abstract String toString();
}
