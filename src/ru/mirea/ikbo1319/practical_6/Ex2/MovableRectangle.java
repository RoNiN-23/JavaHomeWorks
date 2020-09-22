package ru.mirea.ikbo1319.practical_6.Ex2;

import ru.mirea.ikbo1319.practical_5.Rectangle;
import ru.mirea.ikbo1319.practical_6.Ex1.Movable;
import ru.mirea.ikbo1319.practical_6.Ex1.MovablePoint;

public class MovableRectangle extends Rectangle implements Movable {
    private MovablePoint centerRectangle;

    public MovableRectangle(double width, double length, String color, boolean filled, double x, double y){
        super(width, length, color, filled);
        centerRectangle = new MovablePoint(x,y);
    }

    @Override
    public void move(double x, double y) {
        centerRectangle.move(x,y);
    }

    @Override
    public String toString() {
        return centerRectangle.toString();
    }
}
