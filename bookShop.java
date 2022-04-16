import java.util.*;

public class bookShop {
    public static void comments() {
        System.out.println("ADD YOUR COMMENTS ");
        Scanner sc = new Scanner(System.in);
        String com = sc.next();
        dash();
        

    }

    public static void feedbackThanks() {
        dash();
        System.out.println(" THANK YOU ! For Your Valuable Feedback ");
        dash();
    }

    public static void feedback() {
        dash();
        System.out.println("\tGive Your Feedback ");
        dash();
        System.out.println("Give Your Rating 1 to 5  ");
        dash();
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        switch (star) {
            case 1: {
                dash();
                System.out.println("BAD");
                dash();
                comments();
                feedbackThanks();
                break;
            }
            case 2: {
                dash();
                System.out.println("NORMAL");
                dash();
                comments();
                feedbackThanks();
                break;
            }
            case 3: {
                dash();
                System.out.println("GOOD");
                dash();
                comments();
                feedbackThanks();
                break;
            }
            case 4: {
                dash();
                System.out.println("BETTER");
                dash();
                comments();
                feedbackThanks();
                break;
            }
            case 5: {
                dash();
                System.out.println("BEST");
                dash();
                comments();
                feedbackThanks();
                break;
            }
            default: {
                System.out.println("Invalid Rating  choose in 1 to 5  ");
                break;
            }

        }
    }

    public static void issue() {
        dash();
        System.out.println(" YOU CAN ANY ISSUE ABOUT BOOK ");
        dash();
        System.out.println("  YOU CAN CALL  ON THIS NUMBER  906733****");
    }

    public static void user_Pay() {
        System.out.println("CHOOSE A PAYMENT METHOD");
        dash();
        System.out.println(" 1. PHONE PAY \n 2. GOOGLE PAY \n 3. CASH PAY");
        dash();
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        switch (pay) {
            case 1: {
                dash();
                System.out.println(" PHONE PAY NO .906733**** ");
                dash();
                Thanks();
                dash();
                break;

            }
            case 2: {
                dash();
                System.out.println(" GOOGLE PAY NO .906733**** ");
                dash();
                Thanks();
                dash();
                break;
            }
            case 3: {
                dash();
                System.out.println(" CASH PAYMENT IS BETTER THAN ONLINE ");
                dash();
                Thanks();
                dash();
                break;
            }
            default: {
                System.out.println(" YOU CAN CHOOSE INVALID PAYMENT METHOD  ");
                break;
            }

        }
    }

    public static void Thanks() {
        System.out.println("THANK YOU SIR  ");
    }

    public static void getBook() {
        int total = 0;
        System.out.println("HOW MANY BOOKS YOU HAVE ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a[] = new int[15];
            System.out.println(i + ".ENTER THE YOUR BOOK PRIZE ");
            dash();
            a[i] = sc.nextInt();
            total = a[i] + total;
        }
        dash();
        System.out.println("YOUR BOOKS TOTAL PRIZE IS " + total);
        dash();
        System.out.println(" JUST FOR YOU !");
        dash();
        System.out.println(" I CAN GIVE YOU 10% DISCOUNT ");
        dash();
        int newTotal = total - total / 10;
        System.out.println(" APPLYING DISCOUNT YOUR TOTAL PRIZE IS = " + newTotal);
        dash();
    }

    public static void newLine() {
        System.out.println();

    }

    public static void dash() {

        for (int i = 0; i <= 10; i++) {
            System.out.print("-- ");

        }
        newLine();

    }

    public static void user_name() {
        dash();
        System.out.println(" ENTER YOUR GOOOD NAME SIR ");
        dash();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        dash();
        System.out.println("Welcome " + name + "!");
        dash();
        System.out.println("IN SACHIN BOOK SHOP");
        dash();

    }

    public static void main(String[] args) {

        user_name();
        getBook();
        user_Pay();
        issue();
        feedback();
    }
}