package ru.mirea.ikbo1319.Practical_18.Ex1;

import java.util.Scanner;

public class Ex1 {
    static void f(int n){
        int a = 2;
        while(a <= n){
            if(n % a == 0){
                if(a != n){
                    System.out.print(a + " ");
                    f(n / a);
                }
                else System.out.print(a);
                return;
            }
            a++;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        f(in.nextInt());
    }
}
