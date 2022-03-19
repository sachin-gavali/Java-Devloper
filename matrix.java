import java.util.*;

public class matrix {
    public static void main(string args[]) {
        int a[][] = new int[10][10];

        System.out.println(" ENTER THE VALUE ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        // print the matrix
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}