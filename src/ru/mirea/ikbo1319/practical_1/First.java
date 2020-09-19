package ru.mirea.ikbo1319.practical_1;

import java.util.Random;
import java.util.Scanner;
public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int mass[] = {1,2,3,4,5};
        for(int i =0;i<mass.length;i++) {
            sum += mass[i];
        }
        System.out.println("for - "+sum);
        sum = 0;
        int i = 0;
        while(i < 5){
            sum += mass[i];
            i++;
        }
        System.out.println("while - "+sum);
        sum = 0;
        i=0;
        do{
            sum += mass[i];
            i++;
        }
        while(i < 5);
        System.out.println("do while - "+sum);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("argument - "+args[0]);
        System.out.println("----------------------------------------------------------------------------------");
        double j =1;
        double num;
        System.out.print("Гармонический ряд - ");
        while(j<10){
            num = 1/j;
            String message = String.format("%.2f",num);
            System.out.print(message+ "||");
            j++;
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Рандомный массив - ");
        for(i = 0;i < mass.length;i++){
            mass[i] = 0 + (int) (Math.random()*10);
            System.out.print(mass[i]+" ");
        }
        int dop;
        System.out.println();
        j = 0;
        while(j < 5) {
            for (i = 0; i < mass.length-1; i++) {
                if (mass[i] > mass[i + 1]) {
                    dop = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = dop;
                }
            }
            j++;
        }
        System.out.print("Отсортированный массив - ");
        for(i = 0;i< mass.length;i++){
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Рандомный массив №2 - ");
        Random random = new Random();
        for(i = 0;i< mass.length;i++){
            mass[i] = random.nextInt(10);
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        j = 0;
        while(j < 5) {
            for (i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    dop = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = dop;
                }
            }
            j++;
        }
        System.out.print("Отсортированный массив №2 - ");
        for(i = 0;i< mass.length;i++){
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Введите до какого числа расчитывать факториал -  ");
        int fac = sc.nextInt();
        System.out.print("Факториал !"+ fac +" = ");
        System.out.println(foo(fac));
        System.out.println("----------------------------------------------------------------------------------");

    }

    static int foo(int a){
        if(a == 0){
            return 1;
        }
        else return a*foo(a-1);
    }
}
