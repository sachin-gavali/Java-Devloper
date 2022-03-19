public class function {
    public static void sum() {
        int a = 20;
        int b = 30;
        int sum = a + b;
        System.out.println("THE SUM IS = ");
        System.out.println(sum);
    }

    public static void star() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("  SACHIN  IS GOOOOD BOY ");
        sum();
        sum();
        star();
        star();
    }
}
