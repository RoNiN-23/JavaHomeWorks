package ru.mirea.ikbo1319.practical_8.Ex1;

import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {

    public void paintComponent(Graphics paint) {
        Circle circle = new Circle();
        Arc arc = new Arc();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        int i =0;
        while ( i != 5){
            paint.setColor(circle.getRandom());
            paint.fillOval(circle.getPositionX(), circle.getPositionY(), circle.getRadius(), circle.getRadius());
            paint.setColor(arc.getRandom());
            paint.fillArc(arc.getPositionX(), arc.getPositionY(), arc.getWidth(), arc.getHeight(), arc.getArc(), arc.getStart());
            paint.setColor(square.getRandom());
            paint.fillRect(square.getPositionX(), square.getPositionY(), square.getSide(), square.getSide());
            paint.setColor(rectangle.getRandom());
            paint.fillRect(rectangle.getPositionX(), rectangle.getPositionY(), rectangle.getWidth(), rectangle.getHeight());
            i++;
        }
    }
}
