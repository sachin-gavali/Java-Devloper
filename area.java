import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double redius;
        Scanner sc = new Scanner(System.in);
        redius = sc.nextDouble();
        double area = 3.14 * redius * redius;
        System.out.println("  THE AREA IS =" + area);

    }
}