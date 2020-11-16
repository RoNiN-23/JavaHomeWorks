package ru.mirea.ikbo1319.Practical_19.Ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextTest_3 {
    public static void main(String[] args) throws IOException {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        FileWriter writer = new FileWriter("c:\\test\\pr19_3.txt",false);
        writer.write(str);
        writer.close();
    }
}
