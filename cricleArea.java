import java.util.Scanner;

public class cricleArea {
    public static void main(String[] args) {
        int redius;
        System.out.println(" ENTER THE REDIUS ");
        Scanner sc = new Scanner(System.in);
        redius = sc.nextInt();
        float pi = 3.14F;
        float area = pi * redius * redius;
        System.out.println("  THE AREA OF CIRCLE IS =" + area);

    }

}
