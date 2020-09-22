package ru.mirea.ikbo1319.practical_6.Ex1;

import ru.mirea.ikbo1319.practical_6.Ex1.MovableCircle;

import java.util.Scanner;

public class MovableCircleTest {
    public static void main(String[] args) {
        double x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координату 'X' центра окружности - ");
        x = scan.nextDouble();
        System.out.print("Введите координату 'Y' центра окружности - ");
        y = scan.nextDouble();
        MovableCircle movableCircle = new MovableCircle(5,"blue",true,x,y);
        System.out.println("========================================================================");
        System.out.println("Начальные координаты - {x=" + x + ", y=" + y + "}");
        System.out.println("========================================================================");
        System.out.print("На сколько сместить центр по координате 'X'? - ");
        x = scan.nextDouble();
        System.out.print("На сколько сместить центр по координате 'Y'? - ");
        y = scan.nextDouble();
        movableCircle.move(x,y);
        System.out.println("========================================================================");
        System.out.println(movableCircle.toString());
        System.out.println("========================================================================");
    }
}
