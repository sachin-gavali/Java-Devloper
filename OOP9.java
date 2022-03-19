class Name {
    public void Name1(int age, String name) {

        System.out.println(name);
        System.out.println(age);
    }

    // fumction overloding
    public void Name1(int age, String name, int a) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(a);

    }
}

public class OOP9 {
    public static void main(String[] args) {
        Name a1 = new Name();
        a1.Name1(19, "Sachin");
        a1.Name1(20, "TUSHAR", 10);
    }
}
