package ru.mirea.ikbo1319.practical_3.Ex2;
import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
    boolean rings, earrings;
    int size;
    String hair_color, eye_color;
    Scanner scan = new Scanner(System.in);
    System.out.print("У человека есть кольца? true/false - ");
    rings = scan.nextBoolean();
    Human human = new Human(new Hand(), new Head(), new Leg());
    human.getHand().setRings(rings);
    System.out.print("У человека есть серьги? true/false - ");
    earrings = scan.nextBoolean();
    human.getHead().setEarrings(earrings);
    System.out.print("Какой цвет волос у человека? - ");
    hair_color = scan.next();
    human.getHead().setHair_color(hair_color);
    System.out.print("Какой цвет глаз у человека? - ");
    eye_color = scan.next();
    human.getHead().setEyeColor(eye_color);
    System.out.print("Какой размер ноги у человека? - ");
    size = scan.nextInt();
    human.getLeg().setSize(size);
    System.out.println("-----------------------------------------------------------");
    }
}
