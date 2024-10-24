package Oops;

public class Example2 {
    public static void main(String[] args) {
        final int PI=3;
        System.out.println(PI);
        final A a1=new A();
        a1.a=13;
       // a1=new A(); cant do
    System.out.println(a1.a);
    A a2;
        for (int i =0; i <1000000000 ; i++) {
            a2=new A();

        }
    }
}
class A{
     int a=10;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
