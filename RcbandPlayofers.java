import java.util.*;

public class RcbandPlayofers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 0; i < s; --i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (y - x > 2 * z) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        }

    }

}
