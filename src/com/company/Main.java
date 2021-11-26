package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student("Alex", "Al oshyn", "male", "28.01.1980", 41);
        Student secondStudent = new Student("Andriy", "Grunov", "male", "27.11.1982", 39);
        Student thirdStudent = new Student("Ghennadie", "Ursachi", "male", "24.07.1979", 41);
        Student forthStudent = new Student("Natalia", "Lungu", "female", "21.03.1982", 39);

        Professor firstProfessor = new Professor("Ion", "Dumitru", "male", "01.04.1975", 46, 15);

        firstStudent.addStudentAttendance("25.11.2021", true); // nu am reusit sa folosesc Scanner aici
        secondStudent.addStudentAttendance("25.11.2021", false);
        thirdStudent.addStudentAttendance("25.11.2021", true);
        forthStudent.addStudentAttendance("25.11.2021", false);

        Subject math = new Subject("Math", 50);
        math.addStudentToSubject(firstStudent);
        math.addStudentToSubject(secondStudent);
        math.addStudentToSubject(thirdStudent);
        math.addStudentToSubject(forthStudent);
        math.printListOfMathStudents(); // nu returneaza Numele

        math.addProfessorToSubject(firstProfessor);
        math.printListOfMathProfessors(); // nu returneaza Numele


        System.out.print("Please, take a Grade 1: "); /* nu am reusit sa nu-mi permite sa introduc "Grade" daca "isPresent" is False.
    nu reusesc sa accesez variabila "isPresent" din Class "Presence". */

        firstStudent.takeGradeFromConsole();

        firstStudent.takeCommentFromConsole();

        System.out.print("Please, take a Grade 2: ");

        secondStudent.takeGradeFromConsole();

        secondStudent.takeCommentFromConsole();

        System.out.print("Please, take a Grade 3: ");

        thirdStudent.takeGradeFromConsole();

        thirdStudent.takeCommentFromConsole();

        System.out.print("Please, take a Grade 4: ");

        forthStudent.takeGradeFromConsole();

        forthStudent.takeCommentFromConsole();

        System.out.print("\n");

        System.out.println(firstStudent.getFirstName() + " " + firstStudent.getLastName());

        firstStudent.printAttendance();

        firstStudent.printGrades();

        firstStudent.printComment();

        System.out.print("\n");
        System.out.print("\n");

        System.out.println(secondStudent.getFirstName() + " " + secondStudent.getLastName());

        secondStudent.printAttendance();

        secondStudent.printGrades();

        secondStudent.printComment();

        System.out.print("\n");

        System.out.println(thirdStudent.getFirstName() + " " + thirdStudent.getLastName());

        thirdStudent.printAttendance();

        thirdStudent.printGrades();

        thirdStudent.printComment();

        System.out.print("\n");

        System.out.println(forthStudent.getFirstName() + " " + forthStudent.getLastName());

        forthStudent.printAttendance();

        forthStudent.printGrades();

        forthStudent.printComment();

        System.out.print("\n");

        System.out.println("Professor's signature: " + firstProfessor.getFirstName() + " " + firstProfessor.getLastName());
    }

}