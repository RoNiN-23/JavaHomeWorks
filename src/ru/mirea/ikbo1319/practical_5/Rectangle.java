package ru.mirea.ikbo1319.practical_5;

public class Rectangle extends Shape{
    double height;
    double width;

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return 2.0*(height+width);
    }
}
