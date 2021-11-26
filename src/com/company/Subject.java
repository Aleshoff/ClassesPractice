package com.company;

import java.util.ArrayList;

public class Subject {
    String name;
    int hours;
    private ArrayList<Professor> professorList;
    private ArrayList<Student> studentList;

    public Subject(String name, int hours) {
        this.name = name;
        this.hours = hours;
        this.studentList = new ArrayList<>();
        this.professorList = new ArrayList<>();
    }

    public void addStudentToSubject(Student student) {
        studentList.add(student);
    }

    public void addProfessorToSubject(Professor professor) {
        professorList.add(professor);
    }
    public void printListOfMathStudents() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Math is attended by: " + studentList.get(i));
        }
    }
    public void printListOfMathProfessors() {
        for (int i = 0; i < professorList.size(); i++) {
            System.out.println("Math is teached by: " + professorList.get(i));
        }
    }
        @Override
        public String toString () {
            return "Math is attended by: " + this.studentList + "\n" + "Math is teached by: " + this.professorList;
            // nu returneaza Numele
        }
    }

