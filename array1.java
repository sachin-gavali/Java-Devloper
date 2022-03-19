import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int[] sachin = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of arry");
        int size = sc.nextInt();
        sachin = new int[size];
        int sum = 0;
        for (int i = 0; i <= size; i++) {

            sachin[i] = sc.nextInt();
            sum = sum + sachin[i];
            System.out.println("THE SUM IS = " + sum);

        }
    }

}
