package ru.mirea.ikbo1319.Practical_13;

public class Student {
    private int iDNumber;
    private String name, surname, patronymic;
    private double middleMark;

    public Student(int iDNumber, String surname, String name, String patronymic, double middleMark) {
        this.iDNumber = iDNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.middleMark = middleMark;
    }

    public Student() {
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getMiddleMark() {
        return middleMark;
    }

    public void setMiddleMark(double middleMark) {
        this.middleMark = middleMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return  " " + iDNumber +
                " " + surname +
                " " + name +
                " " + patronymic +
                " " + middleMark + "\n";
    }
}

