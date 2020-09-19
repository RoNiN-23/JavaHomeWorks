package ru.mirea.ikbo1319.practical_3.Ex2;

import java.util.Scanner;

public class Human {

    private Hand hand;
    private Head head;
    private Leg leg;


    public Human(Hand hand, Head head, Leg leg){
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Hand getHand(){
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}