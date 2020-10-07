package ru.mirea.ikbo1319.practical_8.Ex3;

import javax.swing.*;

import static ru.mirea.ikbo1319.practical_8.Ex3.Gif.framlist;

public class TestGif extends  Gif{

    public static void main(String[] args) {
        new Gif();
        framlist.add(new ImageIcon("C:/Users/IVC1-5/IdeaProjects/JavaHomeWorks/src/ru/mirea/ikbo1319/practical_8/Ex3/1.png").getImage());
        framlist.add(new ImageIcon("C:/Users/IVC1-5/IdeaProjects/JavaHomeWorks/src/ru/mirea/ikbo1319/practical_8/Ex3/2.png").getImage());
        Gif gif = new Gif();
        while (true) {
            for (int i = 0; i < 3; i++) {
                image = framlist.get(i);
                gif.repaint();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

