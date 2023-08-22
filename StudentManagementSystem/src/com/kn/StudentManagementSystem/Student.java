package com.kn.StudentManagementSystem;



public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    
    // Constructors, getters, setters, and other methods
    public Student(int studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    

}

