package ru.mirea.ikbo1319.practical_6.Ex2;
import java.util.Scanner;

public class MovableRectangleTest {
    public static void main(String[] args) {
        double x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координату 'X' центра прямоугольника - ");
        x = scan.nextDouble();
        System.out.print("Введите координату 'Y' центра прямоугольника - ");
        y = scan.nextDouble();
        MovableRectangle movableRectangle = new MovableRectangle(5,3,"blue",true,x,y);
        System.out.println("========================================================================");
        System.out.println("Начальные координаты - {x=" + x + ", y=" + y + "}");
        System.out.println("========================================================================");
        System.out.print("На сколько сместить центр по координате 'X'? - ");
        x = scan.nextDouble();
        System.out.print("На сколько сместить центр по координате 'Y'? - ");
        y = scan.nextDouble();
        movableRectangle.move(x,y);
        System.out.println("========================================================================");
        System.out.println(movableRectangle.toString());
        System.out.println("========================================================================");
    }
}
