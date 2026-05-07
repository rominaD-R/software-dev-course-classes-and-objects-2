package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of students
//        for (Student s : students) {
//            if (s.name == name) {
//                students.remove(s);
//            }
//        }

        students.removeIf(s -> Objects.equals(s.name, name));

    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        StringBuilder sb1 = new StringBuilder();
        for (Student s : students) {
            sb1.append(s.name);
            sb1.append(" ");
            sb1.append(s.grade);
            sb1.append('\n');
        }
        return sb1.toString();
    }
}
