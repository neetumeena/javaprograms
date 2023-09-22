package codingQuestions.classObjectBasedQs;

public class CallingClass {
    public static void main(String[] args) {
//        SuperClass superclass = new SuperClass();
//        superclass.methodOfSuperClass();         //Output : From Super Class
//        SubClass subclass = new SubClass();
//        subclass.methodOfSuperClass();          //Output : From Super Class
//        subclass.methodOfSuperClass(10);       // Output : 10


//        SubClass b = new SubClass();
//
//        System.out.println(b.i);

        Integer i1 = 127;

        Integer i2 = 127;

        System.out.println(i1 == i2);

        Integer i3 = 128;

        Integer i4 = 128;

        System.out.println(i3 == i4);
        String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5;

        System.out.println(s);

        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;

        System.out.println(i);
    }

}
