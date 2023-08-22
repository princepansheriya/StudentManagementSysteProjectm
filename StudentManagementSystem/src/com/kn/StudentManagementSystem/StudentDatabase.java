package com.kn.StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

