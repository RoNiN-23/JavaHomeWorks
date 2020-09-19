package ru.mirea.ikbo1319.practical_3.Ex3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        String name, date, author;
        int pages;

        Book book = new Book();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите название книги - ");
        name = scan.nextLine();
        System.out.print("Введите фамилию автора - ");
        author = scan.next();
        System.out.print("Введите дату выхода книги - ");
        date = scan.next();
        System.out.print("Введите количество страниц - ");
        pages = scan.nextInt();

        book.setName(name);
        book.setAuthor(author);
        book.setDate(date);
        book.setPages(pages);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Название - '" + book.getName()+"'");
        System.out.println("Книгу написал " + book.getAuthor());
        System.out.println("Книгу выпустили в " + book.getDate() + " году");
        System.out.println("В книге " + book.getPages() + " страниц");
    }
}
