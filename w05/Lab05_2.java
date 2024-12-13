// Thadchanon Maidee 670510662

import java.util.Scanner;

public class Lab05_2 {
    private static final Scanner input = new Scanner(System.in);
        
    public static void compareWeightbase(Person p1, Person p2) { //เมท็อดภายนอกคลาส Person
        int diff1 = Math.abs(p1.getWeight() - p1.getStandardWeight());
        int diff2 = Math.abs(p2.getWeight() - p2.getStandardWeight());
        if (diff1 == diff2) {
            System.out.println("both"); 
        }else if (diff1 < diff2) {
            System.out.println(p1.getName()); 
        }else {
            System.out.println(p2.getName());
        }
    }// end method compareWeightbase()

    public static void main(String[] args) {

        String s = input.next().trim();
        Person p1 = new Person(s); // create an object p1
        char sex = input.next().charAt(0);
        int H = input.nextInt();
        int W = input.nextInt();
        p1.setInfo(sex, H, W);
        s = input.next().trim();
        sex = input.next().charAt(0);
        Person p2 = new Person(s, sex, input.nextInt(), input.nextInt()); // create an object p2
        compareWeightbase(p1, p2); //เรียกใช้เมท็อดภายนอกคลาส Person

    }
} // end method main()

class Person {
    private String Name;
    private char gender;
    private int heigth ;
    private int weight ;

    public Person(String name) {
        Name = name ;
    }

    public Person(String name, char s, int h, int w) {
        Name = name;
        setInfo(s, h, w);
    }

    public void setInfo(char s, int h, int w){
        gender = s;
        heigth = h;
        weight = w;
    }
    
    public String getName(){
        return Name;
    }
    public int getWeight(){
        return weight;
    }

    public int getStandardWeight(){
        if (gender == 'M') {
            return (heigth - 100);
        }else{
            return (heigth - 110);
        }
    }

}
