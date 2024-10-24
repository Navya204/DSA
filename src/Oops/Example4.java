package Oops;

public class Example4 {
    public static void main(String[] args) {
        Human navya=new Human(21,0,"Navya");
        Human chakri=new Human(23,40000,"Chakri");
        System.out.println(navya.population);
        System.out.println(chakri.population);


    }
}
class Human{
    int age;
    int salary;
    String name;
     static long population;
    public Human(int age,int salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
        Human.population+=1;
    }

}
