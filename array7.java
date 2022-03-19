import java.util.Scanner;

public class array7 {
    public static void main(String args[]) {
        int a[] = new int[100];

        System.out.println(" ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            int max;
            max = a[i];
            if (a[i] <= max) {
                System.out.println(" Maximum");

            } else {
                System.out.println("Min");
            }
        }
    }

}
