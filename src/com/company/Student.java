package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private ArrayList<Integer> grades;
    private ArrayList<Presence> attendanceList;
    private ArrayList<String> commentList;

    public Student(String firstName, String lastName, String sex, String birthDate, int age) {
        super(firstName, lastName, sex, birthDate, age);
        this.grades = new ArrayList<>();
        this.attendanceList = new ArrayList<>();
        this.commentList = new ArrayList<>();
    }

    public void addStudentAttendance(String date, boolean isPresent) {
        Presence attendance = new Presence(isPresent, date);
        attendanceList.add(attendance);
    }
    public void addGradeToStudent(int grade) {
        grades.add(grade);
    }
    public void addCommentToStudent(String comment) {
        commentList.add(comment);
    }
    public void takeGradeFromConsole() {
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()) {
            addGradeToStudent(input.nextInt());
        } else {
            System.out.print("Please, input a valid Grade: ");
            takeGradeFromConsole();
        }
    }
    public void takeCommentFromConsole() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        if (grades.get(i) > 0) {
            System.out.print("Please, leave a Comment: ");
            addCommentToStudent(input.nextLine());
        }
    }
        public void printAttendance() {
            for (int i = 0; i < attendanceList.size(); i++)
            System.out.println(attendanceList.get(i));
        }
        public void printGrades() {
            for (int i = 0; i < grades.size(); i++)
                if(grades.get(i) > 0) {
                    System.out.println("Date grade is: " + grades.get(i));
                }
        }
    public void printComment() {
        for (int i = 0; i < commentList.size(); i++)
            System.out.println("Date comment is: " + commentList.get(i));
    }
}
