package ru.mirea.ikbo1319.practical_3.Ex2;

public class Hand {
    boolean rings;

    public void setRings(boolean rings) {
        this.rings = rings;
    }

    public String getRings(){
        if(rings){
            return "Есть кольцо";
        }
        else return "Кольца нет";
    }
}
