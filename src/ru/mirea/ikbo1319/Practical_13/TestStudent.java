package ru.mirea.ikbo1319.Practical_13;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Integer> iDNumber = new ArrayList<Integer>();
        ArrayList<Double> marks = new ArrayList<Double>();
        double[] massMarks;
        massMarks = new double[6];
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Введите ID студентов и иих ФИО (1 Смирнов Егор Олегович), чтобы закончить ввод, введите '0'");
        String name, surname, patronymic;
        int checkId = 1;
        String check = "да";
        int i = 0;
        while (check.equals("да")) {
            System.out.print("Введите ID - ");
            checkId = scanner.nextInt();
            if (check.equals("да")) {
                iDNumber.add(checkId);
                System.out.print("Введите Фамилию - ");
                surname = scanner.next();
                student.setSurname(surname);
                System.out.print("Введите Имя - ");
                name = scanner.next();
                student.setName(name);
                System.out.print("Введите Отчество - ");
                patronymic = scanner.next();
                student.setPatronymic(patronymic);
                students.add(new Student(surname, name, patronymic));
                System.out.print("Введите оценки (6 оценок) - ");
                for (i = 0; i < 6; i++) {
                    massMarks[i] = scanner.nextInt();
                }
                Marks addMark = new Marks(massMarks);
                marks.add(addMark.getMark());
                System.out.print("Добавить ещё одного студента? - ");
                check = scanner.next();
            }
            System.out.println("====================================");

        }
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.Sort(students, marks, iDNumber);
        System.out.println("Отсортированный массив");
        System.out.println("====================================");

        for (i = 0; i < iDNumber.size(); i++) {
            System.out.println(iDNumber.get(i) + " " + students.get(i) + " " + marks.get(i));
        }


    }
}
