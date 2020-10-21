package ru.mirea.ikbo1319.Practical_13;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        double[] massMarks;
        massMarks = new double[6];
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Введите ID студентов и их ФИО: ");
        String name, surname, patronymic;
        int checkId;
        String check = "да";
        int i = 0;
        while (check.equals("да")) {
            if (check.equals("да")) {
                System.out.print("Введите ID - ");
                checkId = scanner.nextInt();
                System.out.print("Введите Фамилию - ");
                surname = scanner.next();
                student.setSurname(surname);
                System.out.print("Введите Имя - ");
                name = scanner.next();
                student.setName(name);
                System.out.print("Введите Отчество - ");
                patronymic = scanner.next();
                student.setPatronymic(patronymic);
                System.out.print("Введите оценки (6 оценок) - ");
                for (i = 0; i < 6; i++) {
                    massMarks[i] = scanner.nextInt();
                }
                Marks addMark = new Marks(massMarks);
                students.add(new Student(checkId, surname, name, patronymic, addMark.getMark()));
                System.out.print("Добавить ещё одного студента? - ");
                check = scanner.next();
            }
            System.out.println("====================================");

        }
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        students.sort(sort);
        System.out.println("Отсортированный массив");
        System.out.println("====================================");

        for (i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


    }
}
