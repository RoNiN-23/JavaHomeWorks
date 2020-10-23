package ru.mirea.ikbo1319.Practical_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice {
    private Scanner scanner = new Scanner(System.in);

    public void addNumber(ArrayList<Integer> numbers) {
        int aDD;
        System.out.print("Введите число, которое хотите добавить - ");
        aDD = scanner.nextInt();
        numbers.add(aDD);
    }

    public ArrayList<Integer> delNumber(ArrayList<Integer> numbers) {
        System.out.println(numbers);
        System.out.print("Введите номер элемент, который хотите удалить - ");
        int del;
        del = scanner.nextInt();
        ArrayList<Integer> delete = new ArrayList<>();
        for (int i = 0; i < del - 1; i++) {
            delete.add(numbers.get(i));
        }
        for (int i = del; i < numbers.size(); i++) {
            delete.add(numbers.get(i));
        }
        return delete;
    }

    public int foundNum(ArrayList<Integer> numbers) {
        int foundIndex;
        int res = 0;
        System.out.print("Введите номер числа, значение которого вы хотите найти? - ");
        foundIndex = scanner.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == foundIndex)res = i;
        }
        return res + 1;
    }

    public int foundIndex(ArrayList<Integer> numbers) {
        int foundNum;
        int res = 0;
        System.out.print("Введите значение числа,индекс которого вы хотите найти? - ");
        foundNum = scanner.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (i == foundNum-1)res = numbers.get(i);
        }
        return res;
    }

    public int max(ArrayList<Integer> numbers){
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max)max = numbers.get(i);
        }
        return max;
    }

    public int min(ArrayList<Integer> numbers){
        int min = 100;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < min)min = numbers.get(i);
        }
        return min;
    }

    public double middle(ArrayList<Integer> numbers){
        double middle = numbers.size();
        double sum = 0;
        for(int i = 0; i< numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum/middle;
    }
}
