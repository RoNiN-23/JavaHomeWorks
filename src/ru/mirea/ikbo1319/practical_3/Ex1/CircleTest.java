package ru.mirea.ikbo1319.practical_3.Ex1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус - ");
        r = scan.nextDouble();
        Circle circle = new Circle();
        circle.setPer(r);
        circle.setArea(r);
        System.out.println(circle.getPer());
        System.out.println(circle.getArea());
    }
}