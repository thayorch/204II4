// Thadchanon Maidee 670510662

import java.util.ArrayList;
import java.util.Scanner;

public class Lab04_5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nStudents = Integer.parseInt(sc.nextLine().trim());

        Student[] students = new Student[nStudents];

        for (int i = 0; i < nStudents; i++) {
            String name = sc.nextLine().trim();

            int nSubjects = Integer.parseInt(sc.nextLine().trim());

            String[] subjects = sc.nextLine().trim().split(" ");
            students[i] = new Student(name, subjects);
        }

        String subjectID = sc.nextLine().trim();

        Student.showStudentsInSubject(students, subjectID);

        sc.close();
    }
}

class Student {

    private String name;
    private String[] subjects;

    public Student(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    private static ArrayList<String> findStudentsEnrolledInSubject(Student[] students, String subjectID) {
        ArrayList<String> enrolledStudents = new ArrayList<>();

        for (Student student : students) {
            for (String subject : student.subjects) {
                if (subject.equals(subjectID)) {
                    enrolledStudents.add(student.name);
                    break;
                }
            }
        }

        return enrolledStudents;
    }


    public static void showStudentsInSubject(Student[] students, String subjectID) {
        ArrayList<String> enrolledStudents = findStudentsEnrolledInSubject(students, subjectID);

        if (enrolledStudents.isEmpty()) {
            System.out.println(0);
        } else {
            for (String studentName : enrolledStudents) {
                System.out.println(studentName);
            }
            System.out.println(enrolledStudents.size());
        }
    }
}
