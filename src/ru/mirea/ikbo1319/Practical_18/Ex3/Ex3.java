package ru.mirea.ikbo1319.Practical_18.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа, чтобы завершить запись, введите 0");
        int max = scanner.nextInt();
        while(true){
            int a = scanner.nextInt();
            if(a == 0)
                break;
            if(a > max)
                max = a;
        }
        System.out.println("Максимальное число: " + max);
    }
}