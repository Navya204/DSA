package Oops.polymorphism;

public class Square extends Shapes {
    //@Override
    static void area(){
        System.out.println("Hello Im in Square block");
    }
    void area1(){
        System.out.println("Im not in Shapes parent class");
    }

}
