package Oops.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1=new BoxWeight(2,2,3,4);
        System.out.println(box1.weight);
        Box box2=new BoxWeight(2,2,3,4);
       //error System.out.println(box2.weight);
        //error BoxWeight box3=new Box(2);

    }
}
