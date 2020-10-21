package ru.mirea.ikbo1319.Practical_13;

public class Marks {
    double mark;

    public Marks(double[] marks) {
        for (int i =0; i < marks.length; i++){
            mark += marks[i];
        }
        mark = mark/marks.length;
    }

    public double getMark() {
        return mark;
    }
}
