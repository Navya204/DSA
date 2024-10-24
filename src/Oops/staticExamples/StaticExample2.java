package Oops.staticExamples;
//static methods

public class StaticExample2 {
    public static void main(String[] args) {
//       StaticExample2 obj=new StaticExample2();
//       obj.greeting();
//
    }
    void greeting(){
        fun();
        //it will accept static methods

    }
    static void fun(){
        //will not accept non static until it creates object
        //greeting();
        StaticExample2 obj=new StaticExample2();
        obj.greeting();



    }
    void fun2(){
        greeting();
    }
}
