import java.util.*;

public class ATM2 {

    public static void dash() {

        for (int i = 0; i <= 15; i++) {
            System.out.print("--");
        }
        newLine();
    }

    public static void Select_op() {
        System.out.println(" Select the service");
        dash();
        System.out.println(" 1. Check balance  .\n 2. Deposit . \n 3. Withdraw .\n 4. exit ");
        dash();
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1: {
                System.out.println("     \t Check balance   ");
                newLine();
                check_balance();
                dash();
                break;
            }
            case 2: {
                System.out.println("     \t Deposit  ");
                newLine();

                dash();
                break;
            }
            case 3: {
                System.out.println("     \t Withdraw  ");
                newLine();
                with_draw();
                dash();
                break;
            }
            /*
             * case 4: {
             * System.out.println("");
             * newLine();
             * 
             * dash();
             * break;
             * }
             */
        }
    }

    public static void check_balance() {
        Main_page();
        System.out.println(" Ac balance is = 1000000");

    }

    public static void newLine() {
        System.out.println();
    }

    public static void with_draw() {
        Main_page();
        dash();
        System.out.println(" Enter Transaction Amout ");
        dash();
        Scanner sc = new Scanner(System.in);
        int Amount = sc.nextInt();
        dash();
        if (Amount > 10) {

            System.out.println(
                    " 1.10 Rs note. \n 2. 20 Rs note . \n 3. 50 Rs note . \n 4. 100 Rs note . \n 5. 500 Rs note . \n 6. 2000 Rs note .");
            int cash = sc.nextInt();
            switch (cash) {
                case 1: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 10;
                    int remain_rs = Amount % 10;
                    System.out.print(" 10 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
                case 2: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 20;
                    int remain_rs = Amount % 20;
                    System.out.print(" 20 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
                case 3: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 50;
                    int remain_rs = Amount % 50;
                    System.out.print(" 50 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
                case 4: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 100;
                    int remain_rs = Amount % 100;
                    System.out.print(" 100 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
                case 5: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 500;
                    int remain_rs = Amount % 500;
                    System.out.print(" 500 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
                case 6: {
                    System.out.println("Your Amount is = " + Amount);
                    dash();
                    int note1 = Amount / 2000;
                    int remain_rs = Amount % 2000;
                    System.out.print(" 2000 Rs Notes = " + note1);
                    System.out.print(" And  " + remain_rs + " Rs");
                    dash();
                    break;

                }
            }
        } else {
            System.out.println(" You can choose efficent Amount for withdraw  ");
        }

        int check;

    }

    public static void Main_page() {
        System.out.println(" Insert card ");
        dash();
        // System.out.println(" Choose language ");
        System.out.println(" Enter a 4 Digit pin  ");
        dash();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int pin = sc.nextInt();
        }

    }

    public static void main(String[] args) {

        Select_op();

    }
}
