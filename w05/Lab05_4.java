// Thadchanon Maidee 670510662
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab05_4 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int sum_total = 0;
        int sum_cradit = 0;

        Student[] s = new Student[N];

        for (int i = 0; i < N; i++) {
            s[i] = new Student(sc.next().charAt(0), sc.nextInt());

            sum_total += s[i].GET_Total();
            sum_cradit += s[i].GET_Cradit();

            System.out.println(s[i].GET_Grade() + " " + s[i].GET_Point() + " " + s[i].GET_Cradit() + " " + s[i].GET_Total());

        }
        System.out.println(sum_cradit + " " + sum_total + " "+df.format((double) sum_total / (double) sum_cradit) );

    }
}

class Student {

    private char grade;
    private int gradePoint;
    private int creditPoint;
    private int totalPoint;

    public Student(char Grade, int Credit) {
        SET(Grade, Credit);
    }

    private void SET(char grade, int credit) {
        this.grade = grade;
        gradePoint = grade_to_point(grade);
        creditPoint = credit;
        calTotal(gradePoint, creditPoint);
    }

    private int grade_to_point(char grade) {
        if (grade == 'A') {
            return 4;
        } else if (grade == 'B') {
            return 3;
        } else if (grade == 'C') {
            return 2;
        } else if (grade == 'D') {
            return 1;
        } else {
            return 0;
        }
    }

    private void calTotal(int grade, int credit) {
        totalPoint = grade * credit;
    }

    public char GET_Grade() {
        return grade;
    }

    public int GET_Point() {
        return gradePoint;
    }

    public int GET_Cradit() {
        return creditPoint;
    }

    public int GET_Total() {
        return totalPoint;
    }

}
