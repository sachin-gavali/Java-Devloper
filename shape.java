class Shape1 {
    public void area() {
        System.out.println(" display area");
    }
}

class Triangle extends Shape1 {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class shape {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }

}
