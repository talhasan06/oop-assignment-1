package Ques7;

public class Override2 extends Base{
    Override2(int a,double b){
        super(a,b);
    }

    Override2(Override2 obj){
        super(obj);
    }
    void show() {
        super.show();
    }
}
