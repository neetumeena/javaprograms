package codingQuestions.recursion;

public class Foo {

    static int foo(int x)
    {
        if(x<=2)
            return x;
        return foo(x-1)+foo(x-2)+foo(x-3);
    }
    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
