package codingQuestions;

class A {
    void m1() {
        System.out.println("In m1 A");
    }
}

class B extends A {
    void m1() {
        System.out.println("In m1 B");
    }
}

public class test2 {

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}

