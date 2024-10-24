package Oops;

public class Example3 {
    public static void main(String[] args) {
        Students s1=new Students(1,"navya",2000);
        Students s2=new Students(2,"chakri",30000);
        Students s3=new Students(3,"rahul",2222);
        System.out.println(Students.population);//this is the right way to access static variables
//        System.out.println(s1.population);
//        System.out.println(s2.population);
//        System.out.println(s3.population);
    }
}
class Students{
    int rno;
    String name;
    float salary;
    static long population;
    Students(int rno,String name,float salary){
        this.rno=rno;
        this.name=name;
        this.salary=salary;
        Students.population += 1;
    }

}
