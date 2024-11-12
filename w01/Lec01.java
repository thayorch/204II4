import java.util.Scanner;

public class Lec01 {
    public static void main(String[] args) {
        Lec01_1();
        Lec01_2();
        Lec01_3();
    }

    // page 3
    public static void Lec01_1() {
        double x = 100.0, y;
        System.out.println("Hello");
        System.out.println("Welcome to 204114 class");
        y = Math.sqrt(x);
        System.out.println("Square root of " + x + " is " + y);
    }

    // page 26

    public static void Lec01_2() {
        int[] s = new int[5];
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i <= 4; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        for (i = 0; i <= 4; i++) {
            System.out.println(s[i]);
        }
        System.out.println(sum);
        // sc.close();
    }


    // page 50

    public static void Lec01_3() {
        String pname; int Qty; double price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Product Name: ");
        pname = sc.nextLine();
        System.out.print("Input Quantity: ");
        Qty = sc.nextInt();
        System.out.print("Input Price per Unit: ");
        price = sc.nextDouble();
        System.out.printf("%s %d Units", pname, Qty);
        System.out.printf("Price per Unit is %.2f bath \n", price);
        System.out.printf("Total Amount is %.2f bath \n", Qty*price);
    }
}