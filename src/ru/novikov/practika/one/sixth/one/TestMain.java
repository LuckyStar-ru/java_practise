package ru.novikov.practika.one.sixth.one;

import ru.novikov.practika.one.sixth.Sorting;

public class TestMain {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Владислав", 10000, 4.3f),
                new Student("Игорь", 10003, 4.2f),
                new Student("Владимир", 10002, 4f),
                new Student("Тимофей", 10001, 3.2f),
                new Student("Илья", 10004, 5f),
        };

        System.out.println("До сортировки: ");
        printStudents(students);
        Sorting.selectionSort(students);
        System.out.println("\nПосле сортировки:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
