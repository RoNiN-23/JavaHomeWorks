package ru.mirea.ikbo1319.practical_6.Ex1;


import ru.mirea.ikbo1319.practical_6.Ex1.Movable;

public class MovablePoint implements Movable {
    private double x,y;
    public MovablePoint(double x, double y){
        this.x =x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Новые координаты - {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
