package ru.mirea.ikbo1319.Practical_13;

import java.util.ArrayList;

public class SortingStudentsByGPA implements Comparator {
    Student sortStudent = new Student();
    int sortID;
    double sortMark;

    public void Sort(ArrayList<Student> students, ArrayList<Double> marks, ArrayList<Integer> iDNumber) {
        this.sortStudent = sortStudent;
        for (int k = 0; k < marks.size(); k++) {
            for (int i = 0; i < marks.size() - 1; i++) {
                if (marks.get(i) < marks.get(i + 1)) {
                    sortMark = marks.get(i);
                    marks.set(i, marks.get(i + 1));
                    marks.set(i + 1, sortMark);

                    sortStudent = students.get(i);
                    students.set(i, students.get(i + 1));
                    students.set(i + 1, sortStudent);

                    sortID = iDNumber.get(i);
                    iDNumber.set(i, iDNumber.get(i + 1));
                    iDNumber.set(i + 1, sortID);
                }
            }
        }
    }
}
