package ru.mirea.ikbo1319.Practical_9;


import ru.mirea.ikbo1319.practical_8.Ex1.Paint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knopka implements ActionListener {
    JFrame jFrame;

    Knopka(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Paint paint = new Paint();
        jFrame.add(paint);
        jFrame.repaint();
    }

}
