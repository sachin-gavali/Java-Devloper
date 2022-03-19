import java.util.*;

class Matrix {
    int a[][] = new int[100][100];
    int b[][] = new int[100][100];
    int c[][] = new int[100][100];

    public void printMatrix() {
        System.out.println(" ENTER THE MATRIX NUMBERS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner sc = new Scanner(System.in);
                a[i][j] = sc.nextInt();

            }
            System.out.println();

        }
        // PRINT THE MATRIX
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  \t   " + a[i][j]);
            }
            System.out.println();
        }

    }

    public void print2Matrix() {
        System.out.println(" ENTER THE 2nd MATRIX NUMBERS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner sc = new Scanner(System.in);
                b[i][j] = sc.nextInt();

            }
            System.out.println();

        }
        // PRINT THE MATRIX
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  \t   " + b[i][j]);
            }
            System.out.println();
        }
    }

    public void print3Matrix() {
        System.out.println(" ENTER THE 2nd MATRIX NUMBERS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner sc = new Scanner(System.in);
                c[i][j] = sc.nextInt();

            }
            System.out.println();

        }
        // PRINT THE MATRIX
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  \t   " + c[i][j]);
            }
            System.out.println();
        }
    }
}

class MatrixPrint extends Matrix {

    public void print2Matrix() {

    }

    public void printMatrix() {

    }

    public void print3Matrix() {

    }

}

public class OOP7 {
    public static void main(String[] args) {
        MatrixPrint Q = new MatrixPrint();
        Q.printMatrix();
        // Q.print2Matrix();

    }
}
