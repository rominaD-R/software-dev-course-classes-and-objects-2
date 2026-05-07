package org.example;

import java.util.Scanner;

// This class handles all I/O for testing the BetterStudentManager class
// You do not need to modify this class
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BetterStudentManager manager = new BetterStudentManager();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View student list");
        System.out.println("4. Exit");
        System.out.print("Enter an option: ");

        String option = scanner.nextLine();

        if (option.equals("1")) {
            addStudent();
        } else if (option.equals("2")) {
            removeStudent();
        } else if (option.equals("3")) {
            viewStudentList();
        } else if (option.equals("4")) {
            System.exit(0);
        } else {
            System.out.println("Invalid option. Try again: ");
            mainMenu();
        }
    }

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        manager.addStudent(name, grade);
        System.out.println("Student added");
        mainMenu();
    }

    public static void removeStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        manager.removeStudent(name);
        System.out.println("Student removed");
        mainMenu();
    }

    public static void viewStudentList() {
        System.out.println(manager.getStudentList());
        mainMenu();
    }
}