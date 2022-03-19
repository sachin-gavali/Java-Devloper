import java.util.*;

public class sumOfMatrix {
    public static void main(String[] args) {
        int a[][] = new int[100][100];
        int b[][] = new int[100][100];
        int c[][] = new int[100][100];

        System.out.println(" ENTER THE NUMBER ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("   \t   " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ENTER THE 2ND MATRIX");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("   \t  " + b[i][j]);

            }
            System.out.println();

        }
        System.out.println(" YOUR SUM IS ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print("   \t  " + c[i][j]);
            }
            System.out.println();
        }
    }

}
