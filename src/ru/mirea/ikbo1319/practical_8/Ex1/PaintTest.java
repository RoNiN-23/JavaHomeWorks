package ru.mirea.ikbo1319.practical_8.Ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Paint paint = new Paint();
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.add(paint);

    }
}
