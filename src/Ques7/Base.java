package Ques7;

public class Base {
    public int a;
    private double b;
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    Base(int a,double b){
        this.a=a;
        this.b=b;
    }
    Base(Base ob){
        a=ob.a;
        b=ob.b;
    }
    Base(){

    }
    void show(){
        System.out.println("Sum of variable"+" "+a+b);

    }
}
