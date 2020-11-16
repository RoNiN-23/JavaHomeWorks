package ru.mirea.ikbo1319.Practical_19.Ex2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextTest_2 {
    public static void main(String[] args) throws IOException {
        String str;
        FileReader reader = new FileReader("c:\\test\\pr19_2.txt");
        Scanner scanner = new Scanner(reader);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }
}
