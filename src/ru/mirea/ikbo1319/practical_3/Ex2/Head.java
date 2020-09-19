package ru.mirea.ikbo1319.practical_3.Ex2;

public class Head {
    String hair_color, eye_color;
    boolean earrings;

    public String getEye_color() {
        return eye_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getEarrings(){
        if(earrings){
            return  "Есть серьги";
        }
        else return "Уши не проколоты";
    }

    public void setEyeColor(String eye_color) {
        this.eye_color = eye_color;
    }

    public void setEarrings(boolean earrings) {
        this.earrings = earrings;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }
}
