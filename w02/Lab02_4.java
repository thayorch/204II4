// 670510662 Thadchanon Maidee

import java.util.*;
public class Lab02_4{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = getData(n);
        int[] B = getData(m); 

        int[] AinB = AinB(A, B); 
        for(int i=0; i<AinB.length; i++) System.out.printf("%d ",AinB[i]);
        System.out.printf("\n%d",maxx(A));
    }

    private static int maxx(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {max = arr[i];}
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                return max;
            }
        }
        return -1;
    }

    private static int[] getData(int n){
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int[] AinB(int[] A ,int[] B){
        int[] arr = new int[A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j]) arr[i]++;
            }
        }
        return arr;
    }
}