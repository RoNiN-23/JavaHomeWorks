package ru.mirea.ikbo1319.practical_8.Ex2;


import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Window extends JComponent {
    private Image image;

    public Window(String path){
        try {
            File f = new File(path);
            System.out.println(path);
            image = ImageIO.read(f);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g){
        g.drawImage(image, 50, 50, this);

    }

}
