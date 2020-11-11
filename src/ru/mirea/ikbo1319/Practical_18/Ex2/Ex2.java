package ru.mirea.ikbo1319.Practical_18.Ex2;

import java.util.Scanner;

public class Ex2 {
    static boolean func(String str){
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return func(str.substring(1, str.length()-1));
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        System.out.print(func(scanner.nextLine()) ? "Это палиндром" : "Это не палиндром");
    }
}
