package Oops.inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double length,double height,double width,double weight){
        super(length,height);
        this.weight=weight;
    }
}
