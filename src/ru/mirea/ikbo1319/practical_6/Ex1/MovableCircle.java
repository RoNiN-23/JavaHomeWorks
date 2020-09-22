package ru.mirea.ikbo1319.practical_6.Ex1;

import ru.mirea.ikbo1319.practical_5.Circle;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint circleCenter;

    public  MovableCircle(double radius, String color, boolean filled, double x, double y){
        super(radius, color, filled);
        circleCenter = new MovablePoint(x,y);
    }

    @Override
    public void move(double x, double y) {
        circleCenter.move(x,y);
    }

    @Override
    public String toString() {
        return circleCenter.toString();
    }
}
