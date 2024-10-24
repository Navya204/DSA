package Oops;

public class Example1 {
    public static void main(String[] args) {
        Student s1=new Student(13,"hello",30.09f);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);
        Student s2=s1;
        System.out.println(s2.name);
        s1.greeting("navya");
        System.out.println(s1);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    public void greeting(String naam){
        System.out.println(this.name+" "+naam);
    }
}
