package ru.mirea.ikbo1319.practical_8.Ex1;

import java.awt.*;
import java.util.Random;

public class Circle extends Shape{
    private int radius;


    public int getRadius() {
        Random random = new Random();
        radius = random.nextInt(100)+20;
        return radius;
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
    public Color getRandom(){
        Random random = new Random();
        r = random.nextInt(256);
        g = random.nextInt(256);
        b = random.nextInt(256);
        Color color = new Color(r,g,b);
        return color;
    }
}
