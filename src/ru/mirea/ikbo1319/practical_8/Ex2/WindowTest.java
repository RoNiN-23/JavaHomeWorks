package ru.mirea.ikbo1319.practical_8.Ex2;
import javax.swing.*;
public class WindowTest extends JFrame{



        public WindowTest(String[] args){
            super("Винни Пух");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setDefaultLookAndFeelDecorated(true);
            setSize(1500, 1300);
            setVisible(true);
            Window img = new Window(args[0]);
            add(img);
            validate();
            repaint();
        }

        public static void main(String[] args) {
            new WindowTest(args);
        }
}
