package ru.mirea.ikbo1319.practical_8.Ex1;

import java.awt.*;
import java.util.Random;

public class Arc extends Shape {
    private int arc, start, width,height;


    @Override
    public int getHeight() {
        Random random = new Random();
        height = random.nextInt(200)+50;
        return height;
    }

    @Override
    public int getWidth() {
        Random random = new Random();
        width = random.nextInt(200)+50;
        return width;
    }

    public int getArc() {
        Random random = new Random();
        arc = random.nextInt(359)+1;
        return arc;
    }

    public int getStart() {
        Random random = new Random();
        start = random.nextInt(180)+20;
        return start;
    }

    @Override
    public int getPositionX(){
        Random random = new Random();
        positionX = random.nextInt(500);
        return positionX;
    }

    @Override
    public int getPositionY(){
        Random random = new Random();
        positionY = random.nextInt(500);
        return positionY;
    }

    @Override
    public Color getRandom() {
        Random random = new Random();
        r = random.nextInt(256);
        g = random.nextInt(256);
        b = random.nextInt(256);
        Color color = new Color(r, g, b);
        return color;
    }
}
