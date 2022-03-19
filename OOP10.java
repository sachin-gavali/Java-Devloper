// multiple inhertence \

class Animal {
    String name;
    String colour;

}

class Tiger extends Animal {
    public void PrintInf() {
        name = " tiger";
        colour = " red";
        System.out.println(name);

        System.out.println(colour);

    }
}

class Cat extends Tiger {

}

public class OOP10 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.PrintInf();
        Cat c1 = new Cat();
        c1.PrintInf();

    }

}
