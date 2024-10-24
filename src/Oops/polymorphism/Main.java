package Oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.area();
        Shapes sh=new Shapes();
        sh.area();
        Shapes sh1=new Square();
        sh1.area();
       //error because area1() not there in parent
        // sh1.area1();
        sq.area1();

    }
}
