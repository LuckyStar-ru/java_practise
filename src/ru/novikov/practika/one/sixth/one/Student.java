package ru.novikov.practika.one.sixth.one;

public class Student implements Comparable<Student> {
    private final String name;
    private final int id;
    private final float averageScore;

    public Student(String name, int id, float averageScore) {
        this.name = name;
        this.id = id;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAverageScore() {
        return averageScore;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return "Студент " + name + "[id=" + id + "; averageScore=" + averageScore + "]";
    }
}
