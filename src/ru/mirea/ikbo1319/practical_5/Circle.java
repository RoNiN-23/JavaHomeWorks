package ru.mirea.ikbo1319.practical_5;
import java.lang.Math;

public class Circle extends Shape {
    double radius;

    public double getArea(){
        return Math.PI*Math.pow(radius,2.0);
    }

    public double getPerimeter(){
        return Math.PI*2.0*radius;
    }

}
