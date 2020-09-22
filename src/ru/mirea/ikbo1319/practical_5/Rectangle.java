package ru.mirea.ikbo1319.practical_5;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){}

    public  Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public  Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return length *width;
    }

    @Override
    public double getPerimeter(){
        return 2.0*(length +width);
    }

    @Override
    public String toString() {
        return "Rectangle - " +
                "color=" + color +
                ", " + isFilled() +
                ", length=" + length +
                ", width=" + width +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter();
    }
}
