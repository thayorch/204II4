// Thadchanon Maidee 670510662
import java.util.Scanner;

public class Lab03_3 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n, m;
        Grader gdr = new Grader();
        n = sc.nextInt();
        String[] gradeStrings = new String[n];

        for(int i=0; i<n; i++){
            gdr.setGrade();
            gdr.calGrade();
            gradeStrings[i] = gdr.showGrade();
        }
        m = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println((i+1)+") "+gradeStrings[i]);
            // System.out.println((i+1)%m);
            if((i+1)%m==0) System.out.println();
        }
    }
}


class Grader{
    private static final Scanner sc = new Scanner(System.in);
    private String std_number;
    private int Mscore, Fscore;
    private int sum_grade;
    private String grade_point;


    public void  setGrade(){
        std_number = sc.next();
        Mscore = sc.nextInt();
        Fscore = sc.nextInt();
    }

    public void calGrade(){
        sum_grade = Mscore+Fscore;
        if(sum_grade>=85&&sum_grade<=100){
            grade_point = "A";
        }else if(sum_grade>=80&&sum_grade<=84){
            grade_point = "B+";
        }else if(sum_grade>=75&&sum_grade<=79){
            grade_point = "B";
        }else if(sum_grade>=60&&sum_grade<=74){
            grade_point = "C+";
        }else if(sum_grade>=55&&sum_grade<=59){
            grade_point = "C";
        }else if(sum_grade>=50&&sum_grade<=54){
            grade_point = "D+";
        }else if(sum_grade>=45&&sum_grade<=49){
            grade_point = "D";
        }else{
            grade_point = "F";
        }
    }

    public String showGrade(){
        return std_number+" "+sum_grade+" "+grade_point;
    }
}