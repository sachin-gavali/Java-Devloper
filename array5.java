import java.util.*;

public class array5 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println(" ENTER  THE NUMBERS ");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
            // get input

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" the number is = " + a[i]);

        }

    }

}
