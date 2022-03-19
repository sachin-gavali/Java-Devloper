import java.util.*;

public class array4 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
            System.out.println(a[i] + a[i]);

        }

    }

}
