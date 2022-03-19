import java.util.Scanner;
import java.lang.Math;

public class project {
    Scanner sc = new Scanner(System.in);

    public static void dash() {
        for (int i = 0; i <= 10; i++) {
            System.out.print("- -");
        }
    }

    public static void name() {
        System.out.println("  ENTER  YOUR GOOD NAME SIR ");
        String Name;
        Scanner sc = new Scanner(System.in);
        Name = sc.next();
        newline();
        System.out.println(" \t\n Hello" + " " + Name + ". \n Welcome in Sachin Book shop");
    }

    public static void newline() {
        System.out.println();

    }

    public static void shop() {
        int n;
        int[] getbook = new int[10];
        int total = 0;

        for (int i = 0; i <= 5; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println(i + 1 + " .ENTER THE BOOK PRIZE");
            n = sc.nextInt();
            dash();
            newline();
            total = n + total;
            System.out.print(" THE TOTAL PRIZE OF BOOK IS = ");
            System.out.print(total);
            newline();
            dash();

        }
        newline();
        System.out.print(" THE TOTAL PRIZE OF BOOK = ");
        System.out.print(total);
        newline();
        System.out.print(" 10% Discouat on all books Enjoy it ");
        total = total - total / 10;
        System.out.print(total);

    }

    public static void main(String[] args) {
        System.out.println(" \tSACHIN BOOK SHOP\n ");
        name();
        dash();
        shop();
        dash();
        newline();
        System.out.println("ENTER THE YOUR PHONE NUMBER");
        Scanner sc = new Scanner(System.in);
        int phoneNo = sc.nextInt();

    }

}
