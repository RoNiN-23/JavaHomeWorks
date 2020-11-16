package ru.mirea.ikbo1319.Practical_19.Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextTest_1 {
    public static void main(String[] args) throws IOException {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        FileWriter writer = new FileWriter("c:\\test\\pr19_1.txt");
        writer.write(str);
        writer.close();
    }
}
