import java.util.*;

class Add {
    int a = 100;
    int b = 200;
    int c = 300;

    public void sum() {
        int add = a + b;
        System.out.println(" THE SUM OF  A + B = " + add);
    }

    public void sub() {
        int Sub = a - b;
        System.out.println(" THE sub  OF  A - B = " + Sub);

    }

    public void printSumOrSub() {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.a + b);
    }
}

class Animal extends Add {
    String name;
    int age;

    String Name = " SACHIN";

    public void dog() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE age ");
        name = sc.next();
        System.out.println("ENTER THE NAME ");
        age = sc.nextInt();

    }

    public void cat() {
        System.out.println(this.Name);
        System.out.println(this.a);
        System.out.println(this.name);
    }

}

public class OOP {
    public static void main(String[] args) {
        System.out.println("  SACHIN GAVALI ");

        Animal s = new Animal();
        s.sub();
        s.sum();
        s.printSumOrSub();
        Animal c = new Animal();
        c.cat();
        c.dog();
        c.cat();

    }

}
