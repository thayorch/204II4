// Thadchanon Maidee 670510662

import java.util.Scanner;

public class Lab04_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix matrix = new Matrix();

        int n = sc.nextInt();
        matrix.setSize(n);
        int i, j;
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                matrix.setMatrix(i, j, sc.nextInt());
                if (!(matrix.checkMatrix(i, j))) {
                    continue;
                }
                matrix.checkTong(matrix.getData(i, j));
            }
        }
        matrix.displays();
    }
}

class Matrix {

    private int[][] matrix;
    private String answer = "";
    private boolean isNone = true;

    public void setSize(int n) {
        matrix = new int[n][n];
    }

    public void setMatrix(int i, int j, int data) {
        matrix[i][j] = data;
    }

    public int getData(int i, int j) {
        return matrix[i][j];
    }

    public boolean checkMatrix(int i, int j) {
        int size = matrix.length - 1;
        if (i == 0 || j == 0 || i == size || j == size) {
            return true;
        }
        if (i == j || j == (size - i)) {
            return true;
        }
        return false;
    }

    public void checkTong(int data) {
        if (data > 0 && data <= 999 && data % 111 == 0) {
            if (isNone) {
                isNone = false;
            }
            answer += (data + " ");
        }
    }

    public void displays() {
        if (isNone) {
            System.out.println("No"); 
        }else {
            System.out.println(answer.trim());
        }
    }
}
