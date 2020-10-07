package ru.mirea.ikbo1319.practical_8.Ex1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    protected Color color;
    protected int positionX, positionY;
    protected int r, g, b;


    public abstract int getPositionX();

    public abstract int getPositionY();

    public abstract Color getRandom();
}
