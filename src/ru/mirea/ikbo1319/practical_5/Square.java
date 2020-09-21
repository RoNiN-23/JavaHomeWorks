package ru.mirea.ikbo1319.practical_5;

public class Square extends Shape{
    double size;

    public double getArea(){
        return Math.pow(size,2.0);
    }

    public double getPerimeter(){
        return 4.0*size;
    }
}
