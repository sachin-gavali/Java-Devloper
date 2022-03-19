import java.util.Scanner;

public class cricle {
    public static void main(String[] args) {

        System.out.println(" ENTER THE REDIUS ");
        Scanner sc = new Scanner(System.in);
        double redius = sc.nextFloat();
        double area = 3.14 * redius * redius;
        System.out.println(" the area is =");
        System.out.println(area);

    }

}
