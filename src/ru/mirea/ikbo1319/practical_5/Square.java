package ru.mirea.ikbo1319.practical_5;

public class Square extends Shape{
    double side;

    public double getArea(){
        return Math.pow(side,2.0);
    }

    public double getPerimeter(){
        return 4.0*side;
    }
}
