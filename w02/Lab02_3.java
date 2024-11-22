// 670510662 Thadchanon Maidee

import java.util.*;
public class Lab02_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inline = 0, outline = 0, online = 0 ;

        int[] A = new int[2];  // (A[0],A[1]) : (x1,y1)
        int[] B = new int[2]; // (B[0],B[1]) : (x2,y2)

        for(int i=0; i<2; i++) A[i] = sc.nextInt();
        for(int i=0; i<2; i++) B[i] = sc.nextInt();
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int status = checkBoundary(A, B, x, y);
            // System.out.println(status);
            switch(status) {
                case 1: inline++; continue;
                case 2: online++; continue;
                case 3: outline++; continue;
            }
        }
        System.out.printf("%d %d %d", inline, online, outline);
    }

    private static int checkBoundary(int[] A, int[] B, int x, int y) {
        int xmin = Math.min(A[0],B[0]);
        int xmax = Math.max(A[0],B[0]);
        int ymin = Math.min(A[1],B[1]);
        int ymax = Math.max(A[1],B[1]);
        // System.out.printf("%d %d %d %d", xmin, xmax, ymin, ymax);

        if(x > xmax || x < xmin || y > ymax || y < ymin){return 3;}
        if(x == xmax || x == xmin || y == ymax || y == ymin){return 2;}
        return 1;

    }
    
}