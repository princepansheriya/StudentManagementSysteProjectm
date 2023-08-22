package com.kn.StudentManagementSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase studentDatabase = new StudentDatabase();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    studentDatabase.addStudent(new Student(studentId, firstName, lastName, age));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int idToRemove = scanner.nextInt();
                    studentDatabase.removeStudent(idToRemove);
                    System.out.println("Student removed successfully!");
                    break;

                case 3:
                    System.out.println("List of Students:");
                    List<Student> students = studentDatabase.getAllStudents();
                    for (Student student : students) {
                        System.out.println(student.getStudentId() + ": " + student.getFirstName() + " " + student.getLastName() + " (Age: " + student.getAge() + ")");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}