package codingQuestions.classObjectBasedQs;

public class SuperClass {
//    void methodOfSuperClass() {
//        System.out.println("From Super Class");
//    }

    static int i = 1111;

    static
    {
        System.out.println("1");
        i = i-- - --i;

    }

    {
        System.out.println("4");

        i = i++ + ++i;
    }

}
