// Thadchanon Maidee 670510662
import java.util.Scanner;
public class Lab04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matrix matrix = new Matrix();

	int n = sc.nextInt();	
	matrix.setSize(n);	
        int i, j;
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                matrix.setMatrix(i, j, sc.nextInt());
            }
        }
        // matrix.displayMatrix();
        matrix.checkMatrix();
	System.out.println(matrix.getType());
    }
}


class Matrix {
    private int size;
    private int[][] matrix;
    private char type;

    public void setSize(int n) {
        size = n;
        matrix = new int[n][n];
    }

    public void setMatrix(int i, int j, int data) {
        matrix[i][j] = data;
    }

    public void checkMatrix() {
        if (isIdentityMatrix()) {
            type = 'I'; 
        } else if (isUpperTriangularMatrix()) {
            type = 'U'; 
        } else if (isLowerTriangularMatrix()) {
            type = 'L'; 
        } else {
            type = 'O';
        }
    }

    public char getType() {
        return type;
    }

    private boolean isIdentityMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && matrix[i][j] != 1) return false;
                if (i != j && matrix[i][j] != 0) return false;
            }
        } return true;
    }

    private boolean isUpperTriangularMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) { 
                if (matrix[i][j] != 0) return false;
            }
        } return true;
    }

    private boolean isLowerTriangularMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) { 
                if (matrix[i][j] != 0) return false;
            }
        }
        return true;
    }

    public void displayMatrix() {
        System.out.println();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
