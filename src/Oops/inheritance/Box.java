package Oops.inheritance;

public class Box {
    double length;
    double width;
    double height;
    Box(){
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    //cube
    Box(double side){
        this.length=side;
        this.height=side;
        this.width=side;
    }
    //2 paramters
    Box(double side1,double side2){
        this.length=side1;
        this.height=side2;
        this.width=-1;
    }
}
