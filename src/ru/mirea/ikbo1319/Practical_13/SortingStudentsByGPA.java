package ru.mirea.ikbo1319.Practical_13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {



    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getMiddleMark() == s2.getMiddleMark()) {
            return 0;
        }
        if (s1.getMiddleMark() < s2.getMiddleMark()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
