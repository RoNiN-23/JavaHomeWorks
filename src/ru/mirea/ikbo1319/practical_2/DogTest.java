package ru.mirea.ikbo1319.practical_2;

import java.util.Scanner;

public class DogTest {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        HomeForDogs home = new HomeForDogs();
        System.out.print("Введите кличку собаки - ");
        name = scan.next();
        while(!(name.equals("стоп"))) {
            System.out.print("Введите возраст собаки - ");
            age = scan.nextInt();
            Dog dog = new Dog(name, age);
            home.dogAdd(name, age);
            System.out.print("Введите кличку собаки (если большене хотите добавить собак, введите 'стоп' - ");
            name = scan.next();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.print("В питомнике след. собаки -> ");
        home.dogsShow();
    }
}
