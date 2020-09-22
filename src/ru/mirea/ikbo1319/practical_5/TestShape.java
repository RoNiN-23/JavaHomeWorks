package ru.mirea.ikbo1319.practical_5;

public class TestShape {
    public static void main(String[] args) {
    double radius, width, length, side;
    boolean filled;
    String color;


    Circle circle = new Circle(3.0,"yellow",true);
    Rectangle rectangle = new Rectangle(5.0, 2.0,"blue",false);
    Square square = new Square(2.0, "red",true);

    System.out.println("|========================================================================================================================|");
    System.out.println("|" + circle.toString());
    System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
    System.out.println("|" + rectangle.toString());
    System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
    System.out.println("|" + square.toString());
    System.out.println("|========================================================================================================================|");
    }
}
