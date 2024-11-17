// 670510662 Thadchanon Maidee
import java.util.*;

public class Lab01_1 {
    private static void printSolution(int x, int y, int c) {
        int count = 2;
        int a = Math.min(x, y);
        int b = Math.max(x, y);
        int sum = summarySolution(a, b);
        System.out.printf("%d %d ", a, b);

        while (sum <= c) { 
            System.out.printf("%d ", sum);
            count++;
            a = b;
            b = sum;
            sum = summarySolution(a, b);
        }

        System.out.printf("\n%d", count);
    }

    private static int summarySolution(int x, int y){
        return (2 * x) + (y + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt(); 
        int c = sc.nextInt();  
        printSolution(a, b, c);
    }
}
