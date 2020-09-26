package ru.mirea.ikbo1319.practical_7;

public class Sofa extends Furniture{
    private boolean fold;

    public Sofa(String color, String material, double height, double width, double lonG, boolean fold) {
        super(color, material, height, width, lonG);
        this.fold = fold;
    }

    public String isFold() {
        if(fold)return "раскладной";
        else return "нераскладной";
    }

    public void setFold(boolean fold) {
        this.fold = fold;
    }
}
