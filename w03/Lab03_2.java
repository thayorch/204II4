// Thadchanon Maidee 670510662

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab03_2 {
    public static void main(String[] args) {
    Course obj1 = new Course();
    Course obj2 = new Course();
    
    obj1.setCourse();
    obj2.setCourse();
    
    obj1.calCourse();
    obj2.calCourse();
        
    obj1.showCourse();
    obj2.showCourse();
    }    

}

class Course {
    private char course_type; // E : Eng & M : Math
    private int course_time;
    private float price;
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");

    public void setCourse(){
        course_type = sc.next().charAt(0);
        course_time = sc.nextInt();
    }

    public void calCourse(){
        if(course_type=='E' || course_type == 'e'){
            for(int i=1; i<=course_time; i++){
                if(i==1){ 
                    price += 800;
                }else if(i>=2&&i<=5){
                    price += 780; 
                }else if(i>=6&&i<=10){
                    price += 750;
                }else{
                    price += 650.50;
                }
            }
        }else if(course_type == 'M' || course_type == 'm'){
            for(int i=1; i<=course_time; i++){
                price += 700;
            }
        }
    }

    public void showCourse(){
        System.out.println(df.format(price)+" ");
    }
}
