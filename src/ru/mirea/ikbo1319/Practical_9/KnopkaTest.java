package ru.mirea.ikbo1319.Practical_9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class KnopkaTest extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        Button button = new Button("Press");
        frame.add(button, BorderLayout.SOUTH);
        button.addActionListener(new Knopka(frame));
        
    }
}
