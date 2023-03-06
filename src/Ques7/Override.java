package Ques7;

public class Override extends Base{
    int c;
    Override(int a,double b,int c){
        super(a,b);
        this.c=c;
    }

    void show() {
        System.out.println("Sum of variable"+" "+a+getB()+c);
    }
}
