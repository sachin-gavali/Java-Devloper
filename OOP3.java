import java.util.*;

class Op {
    int a = 10;
    int b = 20;

    public void sum() {
        int Sum = a + b;
        System.out.println(" THE SUM IS " + Sum);

    }

    public void sub() {
        int sub = a - b;
        System.out.println(" THE SUB IS " + sub);
    }
}

class Op2 extends Op {
    int c = 30;
    int d = 40;

    public void sum1() {
        int Sum = a + b + c;
        System.out.println(" THE SUM IS " + Sum);

    }

    public void Sub1() {
        int sub1 = c - d;
        System.out.println(" THE SUB IS " + sub1);
    }

}

class Op3 extends Op2 {
    int r = 1000;
    int n = 100;

    public void Add() {
        int sad = a + b;
        int dad = a - c;
        int xox = r + n;
        System.out.println(" THE SUB  =" + sad);
        System.out.println(" THE SUB = " + dad);
        System.out.println(" THE SUB  =" + xox);

    }

}

public class OOP3 {
    public static void main(String[] args) {
        Op3 s = new Op3();
        s.sum1();
        s.sub();
        s.sum();
        s.Sub1();
        s.Add();
    }

}
