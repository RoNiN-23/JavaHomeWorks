package ru.mirea.ikbo1319.Practical_15;

import java.util.Scanner;

public class Choice {
    private Scanner scanner = new Scanner(System.in);
    private int[] help;

    public int[] addNumber(int[] numbers) {
        int aDD;
        System.out.print("Введите число, которое хотите добавить - ");
        aDD = scanner.nextInt();
        help = new int[numbers.length + 1];
        for(int i = 0; i < numbers.length;i++){
            help[i] = numbers[i];
        }
        help[help.length - 1] = aDD;
        return help;
    }

    public int[] delNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Введите номер элемент, который хотите удалить - ");
        int del;
        del = scanner.nextInt();
        help = new int[numbers.length - 1];
        int k = 0;
        for (int i = 0; i < del; i++, k++) {
            help[k] = numbers[i];
        }
        for (int i = del + 1; i < numbers.length; i++, k++) {
            help[k] = numbers[i];
        }
        return help;
    }

    public int foundNum(int[] numbers) {
        int foundIndex;
        int res = 0;
        System.out.print("Введите значение числа,индекс которого вы хотите найти? - ");
        foundIndex = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == foundIndex) res = i;
        }
        return res + 1;
    }

    public int foundIndex(int[] numbers) {
        int foundNum;
        int res = 0;
        System.out.print("Введите номер числа, значение которого вы хотите найти? - ");
        foundNum = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (i == foundNum - 1) res = numbers[i];
        }
        return res;
    }

    public int max(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    public int min(int[] numbers) {
        int min = 100;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        return min;
    }

    public double middle(int[] numbers) {
        double middle = numbers.length;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / middle;
    }
}
