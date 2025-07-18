package com.lambdaexpressioncode1.lambdaexpressioncode1.Code;

interface A{
    public default void print(){
        System.out.println("Hi from Print method in interface A");
    }

}
@FunctionalInterface
interface B{
    public void printable();
}

interface C{
    public static void printC(){
        System.out.println("Hi from Interface C. This is static method inside interface.");
    }
}

interface D{
    public void printD();
}
class UsingImplements implements A {
    //Calling Print method using constructor
    UsingImplements(){
        print();
    }
}
public class Java{
    //Using method parameters
    public static void methodParameter(D d){
        d.printD();
    }
    public static void main(String[] args) {
        //Anonymous Class
        A java = new A(){};
        java.print();

        //Using implements
        UsingImplements usingImplements = new UsingImplements();
        usingImplements.print();

        //Using Lambda Expressions
        B b = () ->{
            System.out.println("Hi from printable in Interface B");
        };
        b.printable();

        //interface with static methods
        C.printC();
        methodParameter(() -> System.out.println("Hi from interface D. Lambda passed to method!."));
    }
}
