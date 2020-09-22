package ru.mirea.ikbo1319.practical_5;

public class Rectangle extends Shape{
    double length;
    double width;

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
    
    public double getArea(){
        return length *width;
    }

    public double getPerimeter(){
        return 2.0*(length +width);
    }
}
