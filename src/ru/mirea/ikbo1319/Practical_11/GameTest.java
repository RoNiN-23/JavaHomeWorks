package ru.mirea.ikbo1319.Practical_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameTest extends JFrame {
    public JTextField field = new JTextField("");
    public JTextArea ex = new JTextArea("Введите число от 0 до 20");
    public JButton button = new JButton("Проверить");
    public JTextArea help = new JTextArea("");
    public int trying =-1;
    public int result = (int)(Math.random()*20);
    public int count = 0;
    GameTest(){
        super("Угадайка");
        setSize(400, 400);
        field.setBounds(190,150,30,30);
        ex.setBounds(130,50,145,30);
        ex.setEditable(false);
        button.setBounds(150,300,100,30);
        help.setBounds(100,250,210,30);
        help.setEditable(false);


        add(ex);
        add(help);
        add(field);
        add(button);

        setLayout(null);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trying = Integer.parseInt(field.getText());
                if (trying > result) {

                    help.setText("Нада меньше");

                }
                else if (trying < result){
                    ;
                    help.setText("Нада больше");
                }

                else if (trying == result){
                    help.setBounds(130,150,150,30);
                    help.setFont(new Font("Times new Romans", Font.PLAIN, 15));
                    help.setText("Вы угадали поздравляю!!!!");
                    button.removeAll();
                }
                count++;
                if (count==3) {
                    help.setBounds(130,150,140,30);
                    help.setFont(new Font("Times new Romans", Font.PLAIN, 15));
                    help.setText("Попытки кончились!!!!");
                    button.removeAll();
                }

            }
        });
    }

    public static void main(String[] args) {
        GameTest gameTest = new GameTest();
    }
}

