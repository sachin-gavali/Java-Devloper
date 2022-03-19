
// write a program to calculate the maximum number in arry 
import java.util.*;

public class maximum {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println(" ENTER THE NUMEBR ");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {

            int max = a[i];
            if (a[i] < max) {
                max = a[i];
                System.out.println(" maximum number =" + max);
            }
        }

    }
}