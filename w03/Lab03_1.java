// Thadchanon Maidee 670610662
import java.util.*;

// char sex = sc.next().charAt(0);
// float weight = Float.parseFloat(sc.next()); 
// int height = sc.nextInt();

public class Lab03_1 {
    public static void main(String[] args) {
        Person target = new Person();
        target.setData();
        target.calData();
        target.showData(); 
    }     
}


class Person {
    private static Scanner sc = new Scanner(System.in);
    private char sex;
    private float weight;
    private int height;
    private String gender;
    private String status;

    public void setData(){
        sex = sc.next().charAt(0);
        weight = Float.parseFloat(sc.next());
        height = sc.nextInt(); 
    }

    public void calData(){
        if(sex=='M' || sex== 'm'){
            gender = "Male";
            if(weight < (height-100)){
                status = "OK";
            }else status = "not OK";
        }
        else if(sex=='F' || sex=='f'){
            gender = "Female";
            if(weight < (height-110)){
                status = "OK";
            }else status = "not OK";
        }   
    }

    public void showData(){
        System.out.println(gender+" "+status);
    }
}