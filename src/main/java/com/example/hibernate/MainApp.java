package com.example.hibernate;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        dao.addStudent(new Student("Nitin", "Java", 85));
        dao.addStudent(new Student("Saurabh", "Spring", 90));

        // Read
        System.out.println("All Students:");
        List<Student> list = dao.getAllStudents();
        for (Student s : list) {
            System.out.println(s);
        }

        // Update
        if (!list.isEmpty()) {
            dao.updateStudent(list.get(0).getId(), 95);
        }

        // Delete
        if (list.size() > 1) {
            dao.deleteStudent(list.get(1).getId());
        }

        dao.closeFactory();
        System.out.println("CRUD operations completed successfully.");
    }
}
