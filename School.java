import java.util.*;
import java.util.jar.Attributes.Name;

class Students {
    String name = "vishal";
    int age = 19;
    String Class = "FY";

    public void id(String name) {
        System.out.println(name);
    }

    public void id(int age) {
        System.out.println(age);

    }

    public void id(int age, String name) {
        System.out.println(age + " age " + name + "name ");
    }
}

public class School {
    public static void main(String[] args) {
        Students s = new Students();
        s.id(s.age);
        s.id(s.name);
        s.id(s.name + s.age);
    }

}
