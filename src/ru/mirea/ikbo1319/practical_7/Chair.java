package ru.mirea.ikbo1319.practical_7;

public class Chair extends Furniture {
    private int numOfLegs;

    public Chair(String color, String material, double height, double width, double lonG, int numOfLegs) {
        super(color, material, height, width, lonG);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "\nChair{" +
                ", color=" + getColor() +
                ", material=" + getMaterial() +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", long=" + getLonG() +
                ", numOfLegs=" + numOfLegs +
                '}'+"\n";
    }
}
