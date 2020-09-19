package ru.mirea.ikbo1319.practical_3.Ex3;

public class Book {
    String name, date, author;
    int pages;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
