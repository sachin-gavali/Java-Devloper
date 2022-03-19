import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n + 1; i++)
        // for loop for rows
        {
            for (int j = 0; j <= i - 1; j++)
            // for loop for columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}