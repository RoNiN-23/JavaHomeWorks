package ru.mirea.ikbo1319.Practical_14;

import ru.mirea.ikbo1319.Practical_13.Student;

import java.util.ArrayList;

public class TesterSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Смирнов1", "Егор1", "Олегович1", 4));
        students.add(new Student(2, "Смирнов2", "Егор2", "Олегович2", 3.5));
        students.add(new Student(3, "Смирнов3", "Егор3", "Олегович3", 5));
        students.add(new Student(4, "Смирнов4", "Егор4", "Олегович4", 2));

        double arr[] = new double[students.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = students.get(i).getMiddleMark();
        }

        Sort sort = new Sort(students);
        sort.quickCompare(arr, 0, arr.length -1);
        sort.resQuick();
        System.out.println("===============================================");
    }

}
