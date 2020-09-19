package ru.mirea.ikbo1319.practical_3.Ex1;
import java.lang.Math;

public class Circle {
    double r, per, area;

    public double getArea() {
        return area;
    }

    public void setArea(double r){
        area = Math.pow(r, 2.0)*Math.PI;
    }

    public double getPer(){
        return per;
    }

    public void setPer(double r){
        per = 2*Math.PI*r;
    }

}
