// 670510662 Thadchanon Maidee
import  java.util.Scanner;

public class Lab00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num1 = new int[5], num2 = new int[5],  total = new int[5];
        
        for(int i = 0; i <= 4; i++) {
            num1[i] = sc.nextInt();
            num2[i] = sc.nextInt();
            total[i] = num1[i]+num2[i];
        }
        for(int i = 0; i <= 4; i++) System.out.println(total[i]);
    }
}   