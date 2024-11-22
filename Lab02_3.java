// 670510662 Thadchanon Maidee

import java.util.Scanner;

public class Lab02_3 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, Q5 = 0, Q6 = 0, Q7 = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int quadrant = checkQuadrant(x, y);

            switch (quadrant) {
                case 1 : Q1++;
                case 2 : Q2++;
                case 3 : Q3++;
                case 4 : Q4++;
                case 5 : Q5++;
                case 6 : Q6++;
                default : Q7++;
            }
        }

        System.out.printf("%d %d %d %d", Q1, Q2, Q3, Q4);
        System.out.printf("\n%d %d\n%d", Q5, Q6, Q7);
    }

    static int checkQuadrant(int x, int y) {
        if (x == 0 && y == 0) return 7;
        if (x > 0 && y < 0) return 4;
        if (x < 0 && y < 0) return 3;
        if (y == 0) return 5;
        if (x == 0) return 6;
        if (x < 0) return 2;
        return 1;
    }
}