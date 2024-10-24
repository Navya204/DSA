package Oops.staticExamples;
//static variables

public class StaticExample1 {
    public static void main(String[] args) {
        Human obj1=new Human(21,"navya",13,false);
        Human obj2=new Human(24,"chakku",2345,false);
        System.out.println(obj1.population);
        System.out.println(obj2.population);
    }

}

class Human{
    int age;
    String name;
    float salary;
    boolean married;
    static long population;
    Human(int age,String name,float salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;

    }


}
