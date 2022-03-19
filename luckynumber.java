
// CHOOSE NUMBER GAME IN JAVA 
// SACHIN GAVALI 
// LUCKY NUMBER 
import java.util.Scanner;
import java.lang.Math;

public class luckynumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        for (int i = 0; i <= 10; i++) {
            System.out.println(" ENTER THE ANY NUMBER BETWEEN 1 TO 100");
            number = sc.nextInt();
            if (number == randomNumber) {
                System.out.println(" YOU ARE WIN THIS GAME  ");
                break;

            } else if (number < randomNumber) {
                System.out.println(" NUMBER IS TOO SMALL");

            } else if (number > randomNumber) {
                System.out.println(" NUMBER  IS TOO BIG ");

            } else {
                System.out.println(" CHOOSE NUMBER IN  1 TO 100 ");

            }

        }
        System.out.println("  YOU ARE LOSS YOU CAN TRY ONCE AGAIN ");

    }

}
