
// THE MARKS SYSTEM IN JAVA 
// SACHIN GAVALI
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int sum = 0;
        int sachin = 0;
        System.out.println(" ENTER THE NAME ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter the Your roll number");
        int n = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            System.out.println(" ENTER THE MARKS ");
            sachin = sc.nextInt();
            sum = sachin + sum;
            System.out.println("  TOTAL = ");
            System.out.println(sum);

        }
        sum = sum / 6;
        System.out.println(" total marks in avavrage");
        System.out.println(sum);
        System.out.println("TRY TO BEST OF ME  IN EXAM ");

    }
}
