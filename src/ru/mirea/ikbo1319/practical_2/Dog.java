package ru.mirea.ikbo1319.practical_2;

public class Dog {
    private int age;
    private String name;
    public int humanAge;

    Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int dogAge(int age){
        humanAge = age*7;
        return humanAge;
    }
    public String toString()
    {
        return name + " " + getAge();
    }
}
