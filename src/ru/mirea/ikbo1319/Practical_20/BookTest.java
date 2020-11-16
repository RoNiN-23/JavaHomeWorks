package ru.mirea.ikbo1319.Practical_20;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) throws IOException {
        HashMap <Integer, String> words = new HashMap<>();
        HashMap <Integer, Integer> sum = new HashMap<>();
        String str = "";
        String wordMass[];

        Sort sort = new Sort();

        Scanner file;
        PrintWriter writer;

        file = new Scanner(new File("c:\\test\\test.txt"));
        writer = new PrintWriter("c:\\test\\test2.txt");


//Удаляем все пустые строки и перезаписываем в другой файл
        while (file.hasNext()) {
            String line = file.nextLine();
            if (!line.isEmpty()) {
                writer.write(line);
                writer.write("\n");
            }
        }

        file.close();
        writer.close();

        file = new Scanner(new File("c:\\test\\test2.txt"));
//В новом файле сччитаем кол-во повторений всех слов
        while (file.hasNext()) {
            str = file.nextLine();
            str = str.toLowerCase();
            str = sort.delete(str);
            wordMass = str.split(" ");
            for(int i = 0; i < wordMass.length;i++) {
                sort.quantityWords(wordMass[i], words, sum);
            }
        }
        file.close();
//Вызываем метод сортировки и выводим на экран результат
        sort.sortWords(words,sum);
        for(int i = 1;i < 11;i++){
            System.out.println(words.get(i) + " - "+ sum.get(i));
        }

        writer = new PrintWriter("c:\\test\\test3.txt");
        file = new Scanner(new File("c:\\test\\test2.txt"));

        while (file.hasNext()) {
            str = file.nextLine();
            wordMass = str.split(" ");
            writer.write(sort.swit4(wordMass));
        }
    }
}
