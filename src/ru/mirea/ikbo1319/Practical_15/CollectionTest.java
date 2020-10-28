package ru.mirea.ikbo1319.Practical_15;

import java.util.Random;
import java.util.Scanner;

public class CollectionTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] help;
        int size = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        int sw = 1;
        Choice choice = new Choice();
        while (sw != 0) {
            System.out.println("Выберите действие: ");
            System.out.println("1.Добавить элемент\n2.Удалить элемент\n3.Найти элемент по значению\n4.Найти элемент по индексу\n5.Найти максимальный элемент\n6.Найти минимальный элемент\n7.Найти среднее арифметическое всех элементов\n8.Вывести коллекцию\n0.Завершить работу");
            sw = scanner.nextInt();
            switch (sw) {
                case 1:
                    size = numbers.length + 1;
                    help = new int[numbers.length + 1];
                    help = choice.addNumber(numbers);
                    numbers = new int[size];
                    numbers = help;
                    break;
                case 2: {
                    size = numbers.length - 1;
                    help = new int[numbers.length - 1];
                    help = choice.delNumber(numbers);
                    numbers = new int[size];
                    numbers = help;
                }
                break;
                case 3:
                    System.out.println("Нужный элемент находится по номеру -> " + choice.foundNum(numbers));
                    break;
                case 4:
                    System.out.println("Нужный индекс -> " + choice.foundIndex(numbers));
                    break;
                case 5:
                    System.out.println("Максимальный элемент -> " + choice.max(numbers));
                    break;
                case 6:
                    System.out.println("Минимальный элемент -> " + choice.min(numbers));
                    break;
                case 7:
                    System.out.println("Среднее арифметическое -> " + choice.middle(numbers));
                    break;
                case 8: {
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println();
                }
                ;
                break;
                case 0:
                    break;
                default:
                    System.out.println("Повторите ввод");
            }
        }
    }
}
