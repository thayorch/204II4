// 670510662 Thadchanon Maidee

import java.util.Scanner;
public class Lab02_2{

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0; 
    }
    public static boolean isOdd(int num) {
        return num % 2 != 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isOdd(number)) {
            System.out.println("odd");
        }
        if(isEven(number)){
            System.out.println("even");
        }

        if (isPrime(number)) {
            System.out.println("prime");
        }else{
            System.out.print("not prime");
        }
    }
}
