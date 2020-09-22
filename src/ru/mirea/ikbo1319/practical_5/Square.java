package ru.mirea.ikbo1319.practical_5;

public class Square extends Shape{
    double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side= side;
    }

    @Override
    public double getArea(){
        return Math.pow(side,2.0);
    }

    @Override
    public double getPerimeter(){
        return 4.0*side;
    }

    @Override
    public String toString() {
        return "Square - " +
                "color=" + color +
                ", " + isFilled() +
                ", side=" + side +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter();
    }
}
