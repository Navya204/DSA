package Oops.staticExamples;
//static block

public class StaticExample3 {
    static int a=7;
    static int b;
    static{
        System.out.println("Hi bro I am in static block");
        b=a*2;
    }

    public static void main(String[] args) {
        StaticExample3 obj1=new StaticExample3();
        System.out.println(StaticExample3.a+ " "+ StaticExample3.b);
        b=b+8;
        System.out.println(StaticExample3.a+ " "+ StaticExample3.b);
        StaticExample3 obj2=new StaticExample3();
        System.out.println(StaticExample3.a+ " "+ StaticExample3.b);


    }

}
