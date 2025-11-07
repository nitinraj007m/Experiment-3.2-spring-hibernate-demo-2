package com.example.di;

public class Student {
    private Course course;

    // Constructor-based Dependency Injection
    public Student(Course course) {
        this.course = course;
    }

    public void showDetails() {
        System.out.println("Student details:");
        System.out.println("Enrolled in course: " + course.getCourseName());
    }
}
