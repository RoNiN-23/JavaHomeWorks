package ru.mirea.ikbo1319.Practical_16;

import java.util.ArrayList;
import java.util.Random;

public class GameTester {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> help = new ArrayList<>();
        int n = 0;
        int check = 1;
        int sur = 0;
        int del = 0;
        Random random = new Random();
        first.add(1);
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(9);
        second.add(2);
        second.add(4);
        second.add(6);
        second.add(8);
        second.add(0);
        System.out.println(first);
        System.out.println(second);
        Game game = new Game();
        do {
            game.motion(first, second);
            if (first.size() > 1) {
                help = game.res(first);
                first = new ArrayList<>();
                first = help;
            } else if (first.size() == 1) check = 0;
            if (second.size() > 1) {
                help = game.res(second);
                second = new ArrayList<>();
                second = help;
            } else if (second.size() == 1) check = 0;
            n++;
            if (n == 106) break;
        } while (check != 0);

        if (first.size() == 1) {
            System.out.println("second " + n);
        } else if (second.size() == 1) {
            System.out.println("first " + n);
        } else if (n == 106) {
            System.out.println("Botva");
        }

    }

}
