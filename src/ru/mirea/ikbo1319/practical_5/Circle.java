package ru.mirea.ikbo1319.practical_5;
import java.lang.Math;

public class Circle extends Shape {
    double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2.0);
    }

    @Override
    public double getPerimeter(){
        return Math.PI*2.0*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() +
                '}';
    }
}
